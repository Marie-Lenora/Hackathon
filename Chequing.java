public class Chequing extends Customer{
    private int accountNumber;
    private int totalDepositAmount; 
    private int totalAmountTransferred;
    private int currentAmount;
    private int totalAmountWithdrawn;

    public Chequing(String name, String dateOfBirth, int accountNumber){
        super(name, dateOfBirth);
        this.accountNumber = accountNumber;
        totalDepositAmount = 0;
        currentAmount = 50;
    }

    public void deposit(int depositAmount){
        this.currentAmount += depositAmount;
        this.totalDepositAmount += depositAmount; 
    }
    
    public void withdraw(int amountWithdrawn){
        this.currentAmount -= amountWithdrawn;
        this.totalAmountWithdrawn += amountWithdrawn;

    }

    public void transfer(int amount){
        this.currentAmount -= amount;
        this.totalAmountTransferred += amount; 
    }

    public int getCurrentAmount(){
        return this.currentAmount;
    }

    public int getTotalDepositAmount(){
        return this.totalDepositAmount;
    }

    public int getTotalAmountTransferred(){
        return totalAmountTransferred;
    }

    public int getTotalAmountWithdrawn(){
        return this.totalAmountWithdrawn;
    }

    public void closeAccount(){
    accountNumber = 0;
    totalDepositAmount = 0; 
    totalAmountTransferred = 0;
    currentAmount = 0;
    totalAmountWithdrawn = 0;

    }
}