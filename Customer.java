public class Customer
{
   static int [] database = new int [10000];
   static int size = 0;
   private String name;
   private String dateOfBirth;
   static int accountNumber = 100000;
   private Chequing chequingAccount
   // Savings savingsAccount, Investment investmentAccount; 

   public Customer(String name, String dateOfBirth)
   {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      accountNumber++;
   } 

   /****************************
   //
   //
   **************************/

   public int getAccountNumber()
   {
     return accountNumber;
   }

   public void addCustomer()
   {
     database[size++] = accountNumber;
   }

   /****************************
   // searches for customers information
   // using binary search 
   **************************/
   public boolean search (int accountNumber)
   {
      
     return false;
   }
   ///////////////////////////////////////////////////////////////////////////
   /********************* 
   //Chequing account information
   //Chequing methods are 
   //createChequings()
   //depositChequings()
   //withdrawChequings
   //closeChequings
   //isChequingOpen()
   **********************/
   public void createChequings()
   {
      Chequing chequingAccount =  new Chequing(name, dateOfBirth); 
   }
   

   public void depositChequings(int amount)
   {
      chequingAccount.deposit(amount);
      System.out.println("Your new balance is $" + chequingAccount.getCurrentAmount());
   }

   public void withdrawChequings(int amount)
   {
    chequingAccount.withdraw(amount);
    System.out.println("Your new balance is $" + chequingAccount.getCurrentAmount());
   }
   
   public void closeChequings()
   {
     int amount = chequingAccount.getCurrentAmount();
     System.out.println("Your Chequings account has a balance of $" + amount)
     chequingAccount.withdraw(amount);
     chequingAccount = null;
     System.out.println("Your Chequings account has been closed with a $0");
   }

   public boolean isChequingsOpen(Customer cx)
   {
     
     boolean validAccount = false;
     if(cx.chequingAccount != null)
     {
        validAccount = true;
     }
     return validAccount 
   }

   /////////////////////////////////////////////////////////////////
   /********************* 
   //Savings account information
   //Savings methods are 
   //createSavings()
   //depositSavings()
   //withdrawSavings
   //closeSavings
   //isSavingsOpen
   **********************/
   public void createSavings()
   {
      //Savings savingsAccount =  new Savings(name, dateOfBirth); 
   }

   public void closeSavings()
   {
      ///System.out.println("Your Savings account has a balance of :" "call the method to get the balance" "")
     // call savingsAccount.withdraw();
     // call savingsAccount.closeAccount();
     // System.out.println("Your Savings account has been closed with a $0");
   }

   public int depositSavings(int amount)
   {
     return 0;
   }

   public int withdrawSavings(int amount)
   {
     return 0;
   }
   
   public boolean isSavingsOpen(Customer cx)
   {
     return false;
   }
  

   ////////////////////////////////////////////////////////////////////////////
   /********************* 
   //Investment account information
   //Investment methods are 
   //createInvestment()
   //depositInvestment()
   // withdrawInvestment()
   //closeInvestment()
   //isChequingOpen()
   //isInvestmentOpen()
   **********************/
   public void createInvestment()
   {
     //Investment investmentAccount = new Investment(name, dateOfBirth);
   }

   public int depositInvestment(int amount)
   {
     return 0;  
   } 

   public int withdrawInvestment(int amount)
   {
     return 0;  
   } 

   public void closeInvestment()
   {
     ///System.out.println("Your Investment account has a balance of :" "call the method to get the balance" "")
     // call investmentAccount.withdraw();
     // call investmentAccount.closeAccount();
     System.out.println("Your Investment account has been closed with a $0");
   }

   public boolean isInvestmentOpen(Customer cx)
   {
     return false;
   }

}

