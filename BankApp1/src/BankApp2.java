import java.util.InputMismatchException;
import java.util.Scanner;


public class BankApp2{

    protected double myBalance = 10.40;
    protected double bankBalance = 1000000;
    protected double creditRating = 0.1;
    private static final int PIN = 1234;
    boolean access = false;
    protected Scanner s = new Scanner(System.in);

    public BankApp2() {

        int pin = 0000;
        int option;

        System.out.print("Please enter your 4 digit pin code: ");
        try {
            pin = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Invalid character entered, bye bye...");
        }

        if (pin != PIN) {
            System.err.println("Incorrect PIN entered, please try again later.");
            System.exit(0);
        }
        access = true;
        System.out.println("Welcome to JCBank please choose from the following options");
        System.out.println();
        System.out.println("Withdraw (1)\tDeposit (2)\tCheck Balance (3)\tApply for Loan(4) \tQuit (5)");
        System.out.println();

        do {
            option = s.nextInt();
        } while(!selectOption(option));
    }

    public boolean selectOption(int option) {
        switch (option) {
            case 1:
                System.out.println("You would like to withdraw");
                System.out.println();
                break;
            case 2:
                System.out.println("You would like to Deposit");
                System.out.println();
                break;
            case 3:
                System.out.println("Your account balance is £" + myBalance);
                System.out.println();
                break;
            case 4:
                System.out.println("Please wait whilst we perform a credit check.");
                try {
                    checkCreditRating();
                } catch (InterruptedException e) {
                    System.out.println("How embarrassing, the system is currently unavailable. Try again later.");
                }
                System.out.println();
                break;
            case 5:
                System.out.println("Successfully logged out, see you soon!");
                System.out.println();
                return true;
            default:
                System.out.println("Invalid option, please choose another option.");
                System.out.println();
                return false;
        }
            System.out.println("Please choose another option.");
            return false;
    }

    public void deposit(double amount) {
        myBalance += amount;
    }

    public void withdraw(double amount) {
        if (myBalance > amount) {
            System.out.println("Your funds have been successfully withdrawn.");
        } else {
            System.out.println("You don't have the funds to complete this transaction");
        }
    }

    public void checkCreditRating() throws InterruptedException {
        Thread.sleep(1000);
        if (creditRating <= 0.0) {
            System.err.println("Sorry, we can't lend you any money at this time.");
            return;
        }

        System.out.print("Please enter your loan amount: ");
        double amount = s.nextDouble();
        if (amount > bankBalance) {
            System.err.println("We are unable to loan you such an amount.");
        }
        double amountToPayBack = (20/100)*amount;
        System.out.println("The amount to payback is " + amountToPayBack);
    }

    public double checkAccountBalance() {
        return myBalance;
    }
}
