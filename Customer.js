class Customer {
    static database = new Array(10000);
    static size = 0;
    static accountNumber = 100000;
  
    constructor(name, dateOfBirth) {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      Customer.accountNumber++;
    }
  
    getAccountNumber() {
      return Customer.accountNumber;
    }
  
    addCustomer() {
      Customer.database[Customer.size++] = Customer.accountNumber;
    }
  
    search(accountNumber) {
      return false;
    }
  
    createChequings() {
      this.chequingAccount = new Chequing(this.name, this.dateOfBirth);
    }
  
    depositChequings(amount) {
      this.chequingAccount.deposit(amount);
      console.log(`Your new balance is $${this.chequingAccount.getCurrentAmount()}`);
    }
  
    withdrawChequings(amount) {
      this.chequingAccount.withdraw(amount);
      console.log(`Your new balance is $${this.chequingAccount.getCurrentAmount()}`);
    }
  
    closeChequings() {
      let amount = this.chequingAccount.getCurrentAmount();
      console.log(`Your Chequings account has a balance of $${amount}`);
      this.chequingAccount.withdraw(amount);
      this.chequingAccount = null;
      console.log(`Your Chequings account has been closed with a $0`);
    }
  
    isChequingsOpen() {
      let validAccount = false;
      if (this.chequingAccount !== null) {
        validAccount = true;
      }
      return validAccount;
    }
  
    
  }
  
  class Chequing {
    constructor(name, dateOfBirth) {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      this.currentAmount = 0;
    }
  
    deposit(amount) {
      this.currentAmount += amount;
    }
  
    withdraw(amount) {
      if (this.currentAmount >= amount) {
        this.currentAmount -= amount;
      } else {
        console.log("Insufficient funds");
      }
    }
  
    getCurrentAmount() {
      return this.currentAmount;
    }
  }
  