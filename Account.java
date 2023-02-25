public class Account {

    //Instance variables
    private String customerName;
    private int accountNumber;
    //private AccountType account;
    private int accountBalance;

    static int number = 100000;

    //Constructors
    public Account(String name ) {
        accountBalance = 0;
        accountNumber = number;
        this.customerName = name;
        number++;
    }

    public Account(String name, int money) {
        accountBalance = money;
        customerName = name;
        accountNumber = number;
        number++;
    }

    //Instance methods
    public int getAccountBalance() {
        return accountBalance;
    }

    public int deposit(int amount) {
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    public int getAccounntNumber() {
        return accountNumber;
    }

    public String getName() {
        return customerName;
    }

}
