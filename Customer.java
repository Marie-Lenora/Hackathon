public class Customer
{
   private String name;
   private String dateOfBirth;
   private static int accountNumber = 100000;
   //private Chequing chequingAccount, Savings savingsAccount, Investment investmentAccount; 

   public Customer(String name, String dateOfBirth)
   {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      accountNumber++;
   } 

   public void createChequings()
   {
      //Chequing chequingAccount =  new Chequing(accountNumber); 
   }

   public void createSavings()
   {
      //Savings savingsAccount =  new Savings(accountNumber); 
   }
   
   public void createInvestment()
   {
     //Investment investmentAccount = new Investment(accountNumber);
   }

   public void closeChequings()
   {
     
     //System.out.println("Your Chequings account has a balance of :" "call the method to get the balance")
     // call chequingAccount.withdraw();
     // call chequingAccount.close();
     // System.out.println("Your Chequings account has been closed with a $0");
   }

   public void closeSavings()
   {
      ///System.out.println("Your Savings account has a balance of :" "call the method to get the balance" "")
     // call savingsAccount.withdraw();
     // call savingsAccount.closeAccount();
     // System.out.println("Your Savings account has been closed with a $0");
   }
   public void closeInvestment()
   {
     ///System.out.println("Your Investment account has a balance of :" "call the method to get the balance" "")
     // call investmentAccount.withdraw();
     // call investmentAccount.closeAccount();
     // System.out.println("Your Investment account has been closed with a $0");
   }

   public int depositChequings(int amount)
   {
     return 0;
   }

   public int depositSavings(int amount)
   {
     return 0;
   }

   public int depositInvestment(int amount)
   {
     return 0;  
   } 

   public int withdrawChequings(int amount)
   {
     return 0;
   }

   public int withdrawSavings(int amount)
   {
     return 0;
   }

   public int withdrawInvestment(int amount)
   {
     return 0;  
   } 

   public boolean isChequingsOpen(Customer cx)
   {
     return false;
   }

   public boolean isSavingsOpen(Customer cx)
   {
     return false;s
   }

   public boolean isInvestmentOpen(Customer cx)
   {
     return false;
   }

}

