import java.util.Scanner;
                public class AtmSystem
        {
    public static void main(String args[] )
    { 
	        int Account_Balance = 1000000,withdraw = 0,Amount,Balance=0;
	        Scanner s = new Scanner(System.in);
	        while(true)	       
                {
                     System.out.println("\nHELLO USER WELCOME TO:\n");
	            System.out.println("\nFOXFI MICROFINANCE ATM :)");
                    System.out.println("USERNAME : ROSELYN WAMBUI NYAMBURA");
                    System.out.println("ACCOUNT NO: 11136872349");
                    System.out.println("Press 1 to Withdraw");
	            System.out.println("Press 2 to Check Balance");
	            System.out.println("Press 3 to Cancel ");
	            System.out.print("What do you want to do?\n");
	            int x = s.nextInt();
	            switch(x)
	            {
	                case 1:
	                System.out.println("\nEnter money to be withdrawn:");
                    withdraw = s.nextInt();
	                if(Account_Balance >= withdraw)
	                {
                        boolean fixed = withdraw <= 600000;
                            Balance=(Account_Balance -withdraw);
      System.out.println("Please collect your money:" +withdraw );
      System.out.println("Your Balance is:\n " +Balance);
	                }
	                else               {
                    System.out.println("Insufficient Balance");
                        }
                        break;
                        
                         case 2:
      if(Account_Balance>=0){
          Balance= Account_Balance -withdraw;
      System.out.print("Your Balance is :\n "+Balance);
      }
                        break;
                        
                         default:
                            System.out.println("\nCancelling...");
                               System.out.println("Cancelled.");
                                System.out.println("GOODBYE :)");
                            System.out.println("\n");
                            System.exit(0);
                            break;
                            
          }
                  
       }
    }
  }