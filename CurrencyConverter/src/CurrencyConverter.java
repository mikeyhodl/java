import java.util.Scanner;

public class CurrencyConverter
{
    public CurrencyConverter()
    {
        char us_dollar_sym = 36;
        char pound_sym = 163;
        char yen_sym = 165;
        char euro_sym = 8364; 

        String us_dollar = "Dollars"; 
        String pound = "Pounds";
        String yen = "Yen";
        String euro = "Euros";
        double rate = 0;


        // Interface
        System.out.println("Welcome to the Currency Converter Program \n");
        System.out.println("Use the following codes to input your currency choices: \n 1 - US dollars \n 2 - Euros \n 3 - British Pounds \n 4 - Japanese Yen \n");

        // 
        System.out.println("Please choose the input currency:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt(); 

       String inType = null;
        switch(choice) {
        case 1: inType = "US Dollars >> " + us_dollar_sym;  break;
        case 2: inType = "Euros >> " + euro_sym; break;
        case 3: inType = "British Pounds >> " + pound_sym; break;
        case 4: inType = "Japanese Yen >> " + yen_sym; break;
        default:
        System.out.println("Please restart the program & enter a number from the list.");
        return;
      }

        System.out.println("Please choose the output currency");
        int output = in.nextInt();

        System.out.printf("Now enter the input in " + inType);
        double input = in.nextDouble(); 

      if (choice == output) 
        System.out.println("Same currency no need to convert");

      if (choice == 1 && output == 2)
        { 
           double dollar_euro_rate = 0.78391;
           rate = input * dollar_euro_rate;
           System.out.printf( "%s" + input + " at a conversion rate of " + dollar_euro_rate + " Dollars to %s = %.2f\n", (char)us_dollar_sym, euro, rate);
        }
        else if (choice == 1 && output == 3){ 
           double dollar_pound_rate = 0.621484;
           rate = input * dollar_pound_rate;
           System.out.printf( "%s" + input + " at a conversion rate of " + dollar_pound_rate + " Dollars to %s = %.2f\n", (char)us_dollar_sym, pound, rate);
        }
        else if (choice == 1 && output == 4){ 
          double dollar_yen_rate = 107.174;
          rate = input * dollar_yen_rate;
          System.out.printf( "%s" + input + " at a conversion rate of " + dollar_yen_rate + " Dollars to %s = %.2f\n", (char)us_dollar_sym, yen, rate);
        }
      if (choice == 2 && output == 1)
      {
          double euro_dollar_rate = 1.27579;
          rate = input * euro_dollar_rate;
          System.out.printf( "%s" + input + " at a conversion rate of " + euro_dollar_rate + " Euros to %s = %.2f\n", (char)euro_sym, us_dollar, rate);
        }
        else if (choice == 2 && output == 3)
        {
          double euro_pound_rate = 0.792648;
          rate = input * euro_pound_rate;
          System.out.printf( "%s" + input + " at a conversion rate of " + euro_pound_rate + " Euros to %s = %.2f\n", (char)euro_sym, pound, rate);
        }
        else if (choice == 2 && output == 4)
        {
          double euro_yen_rate = 136.708;
          rate = input * euro_yen_rate;
          System.out.printf( "%s" + input + " at a conversion rate of " + euro_yen_rate + " Euros to %s = %.2f\n", (char)euro_sym, yen, rate);
        }
      if (choice == 3 && output == 1)
      {
          double pound_dollar_rate = 1.60972;
          System.out.printf( "%s" + input + " at a conversion rate of " + pound_dollar_rate + " Pounds to %s = %.2f\n", (char)pound_sym, us_dollar, rate);
        }
        else if (choice == 3 && output == 2)
        {
          double pound_euro_rate = 1.26161;
          System.out.printf( "%s" + input + " at a conversion rate of " + pound_euro_rate + " Pounds to %s = %.2f\n", (char)pound_sym, euro, rate);
        }
        else if (choice == 3 && output == 4)
        {
          double pound_yen_rate = 172.511;
          System.out.printf( "%s" + input + " at a conversion rate of " + pound_yen_rate + " Pounds to %s = %.2f\n", (char)pound_sym, yen, rate);
        }
      if (choice == 4 && output == 1)
      { 
          double yen_dollar_rate = 0.00932574;
          System.out.printf( "%s" + input + " at a conversion rate of " + yen_dollar_rate + " Yen to %s = %.2f\n", (char)yen_sym, us_dollar, rate);
        }
        else if (choice == 4 && output == 2)
        { 
          double yen_euro_rate = 0.00730615;
          System.out.printf( "%s" + input + " at a conversion rate of " + yen_euro_rate + " Yen to %s = %.2f\n", (char)yen_sym, euro, rate);
        }
        else if (choice == 4 && output == 3)
        {
          double yen_pound_rate = 0.00579135;
          System.out.printf( "%s" + input + " at a conversion rate of " + yen_pound_rate + " Yen to %s = %.2f\n", (char)yen_sym, pound, rate);
        }
       System.out.println("Thank you for using the currency converter");
    }
}
