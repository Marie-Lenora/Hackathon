public class Account {

    //Instance varianles
    private String customerName;
    private int accountNumber;
    //private AccountType account;
    private int accountBalance;

    //Constructor
    public Account(String name ) {
        accountBalance = 0;
        accountNumber = 1000000;
        this.customerName = name;
        accountNumber++;
    }

}
