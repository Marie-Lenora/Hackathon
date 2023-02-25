public class Customer
{
   static final int SIZE = 150;
   static Customer [] database = new Customer [SIZE];
   static int size = 0;
   private String name;
   private String password;
   private Chequing chequingAccount;
   // Savings savingsAccount, Investment investmentAccount; 

   public Customer(String name, String password)
   {
      this.name = name;
      this.password = password;
      chequingAccount = null;
      database[size++] = this;
   } 

   /****************************
   //
   //
   **************************/
  public String getName()
  {
    return name;
  }

   public String getpassword()
   {
     return password;
   }



   

   /****************************
   // searches for customers information
   // using binary search 
   **************************/
   public boolean search (String password)
   {
      boolean find = false;
      int i = 0;
      while(i<size && !find)
      {
        if((database[i].password).equals(password))
        {
          find = true;
        }
        i++;
      }
      return find;
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
     chequingAccount =  new Chequing(name, password); 
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
     System.out.println("Your Chequings account has a balance of $" + amount);
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
     return validAccount; 
   }

   
}

