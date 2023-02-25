

public class Main {

    public static void main(String[] args) {
        Account lab = new Account("Funmi Akintola");
        Account bal = new Account("Marinara X", 2000);

        lab.deposit(4500);

        System.out.println(lab.getName() +"'s account number is " + lab.getAccounntNumber() + " and she has " + lab.getAccountBalance() + " in her account.");
        System.out.println(bal.getName() + "'s account number is " + bal.getAccounntNumber() + " and she has " + bal.getAccountBalance() + " in her account.");
    }
}
