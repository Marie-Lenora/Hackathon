class Customer {
    
    static database = new Array(150);
    static size = 0;
    
    
    constructor(name, password) {
    this.name = name;
    this.password = password;
    this.chequingAccount = null;
    database[size++] = this;
    }
    getName() {
    return this.name;
    }
    
    getPassword() {
    return this.password;
    }
    
    search(password) {
    let find = false;
    let i = 0;
    while (i < size && !find) {
    if (database[i].getPassword() === password) {
    find = true;
    }
    i++;
    }
    return find;
    }
    
    createChequings() {
    this.chequingAccount = new Chequing(this.name, this.password);
    }
    
    depositChequings(amount) {
    this.chequingAccount.deposit(amount);
    console.log('Your new balance is $${this.chequingAccount.getCurrentAmount()}');
    }
    
    withdrawChequings(amount) {
    this.chequingAccount.withdraw(amount);
    console.log('Your new balance is $${this.chequingAccount.getCurrentAmount()}');
    }
    
    closeChequings() {
    let amount = this.chequingAccount.getCurrentAmount();
    console.log('Your Chequings account has a balance of $${amount}');
    this.chequingAccount.withdraw(amount);
    this.chequingAccount = null;
    console.log('Your Chequings account has been closed with a $0');
    }
    
    isChequingsOpen() {
    return this.chequingAccount !== null;
    }
    }
    
    class Chequing extends Customer {
    constructor(name, password) {
    super(name, password);
    this.totalDepositAmount = 0;
    this.currentAmount = 50;
    this.totalAmountTransferred = 0;
    this.totalAmountWithdrawn = 0;
    }
    
    deposit(depositAmount) {
    this.currentAmount += depositAmount;
    this.totalDepositAmount += depositAmount;
    }
    
    withdraw(amountWithdrawn) {
    this.currentAmount -= amountWithdrawn;
    this.totalAmountWithdrawn += amountWithdrawn;
    }
    
    transfer(amount) {
    this.currentAmount -= amount;
    this.totalAmountTransferred += amount;
    }
    
    getCurrentAmount() {
    return this.currentAmount;
    }
    
    getTotalDepositAmount() {
    return this.totalDepositAmount;
    }
    
    getTotalAmountTransferred() {
    return this.totalAmountTransferred;
    }
    
    getTotalAmountWithdrawn() {
    return this.totalAmountWithdrawn;
    }
    

    }
    
    
    
    