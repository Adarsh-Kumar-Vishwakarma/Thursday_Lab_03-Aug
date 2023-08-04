// QUESTION NO. 4

// Package declaration
package Adarsh;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Create a class named "Bank_operation"
public class Bank_operation {

    // Create a Scanner object to read user input
    Scanner sc = new Scanner(System.in);

    // Declare instance variables for bank information and account details
    String Bank_name, // Bank name variable
            Branch_name, // Branch name variable
            Ac_holder_name, // Account holder name variable
            Account_type = "Saving"; // Account type variable with default value "Saving"

    int loan_amt, // Loan amount variable
            loan_year, // Loan period variable
            pin; // User PIN variable

    // Private instance variables for security purposes
    private int Pin_no = 916712; // Private PIN number
    private int Account_no; // Private account number
    private double Balance = 1000000; // Private account balance with default value 1,000,000 lakh

    double withdraw_amt, // Amount to be withdrawn variable
            deposit_amt; // Amount to be deposited variable

    // Getters and setters for private variables
    public double getBalance() {
        return Balance; // Get current balance
    }

    public void setBalance(double balance) {
        Balance = balance; // Set balance to a new value
    }

    public int getPin_no() {
        return Pin_no; // Get PIN number
    }

    public void setPin_no(int pin_no) {
        Pin_no = pin_no; // Set PIN number to a new value
    }

    public int getAccount_no() {
        return Account_no; // Get account number
    }

    public void setAccount_no(int account_no) {
        Account_no = account_no; // Set account number to a new value
    }

    // Method to display user details
    public void user_detail() {
        System.out.println("Your Bank Name is " + Bank_name); // Display bank name
        System.out.println("Your Branch Name is " + Branch_name); // Display branch name
        System.out.println("Your Account Type is " + Account_type); // Display account type
        System.out.println("Your Pin Number is " + Pin_no); // Display PIN number
        System.out.println("Your Account Number is " + Account_no); // Display account number
        System.out.println("Your Name is " + Ac_holder_name); // Display account holder name
    }

    // Method to accept user details
    public void accept_detail() {
        System.out.println("Enter The Bank name: "); // Prompt for bank name
        Bank_name = sc.next();

        System.out.println("Enter The Branch name: "); // Prompt for branch name
        Branch_name = sc.next();

        System.out.println("Enter The Account Number: "); // Prompt for account number
        Account_no = sc.nextInt();

        System.out.println("Enter The Account Holder Name: "); // Prompt for account holder name
        Ac_holder_name = sc.next();

        System.out.println("Enter Your Pin Please"); // Prompt for PIN number
        pin = sc.nextInt();
        if (Pin_no == pin) {
            System.out.println("\nAccount Authorized!\n"); // Authorized access message
        }
        display(); // Display main menu
    }

    // Method to view account balance
    public void viewBalance() {
        System.out.println("\nLoading Account Balance.........");
        System.out.println("\nYour Saving Account Balance is :" + Balance + "/-"); // Display account balance
        System.out.println();// Empty line for formatting
    }

    // Method to calculate and handle withdrawal amount
    public void withdraw_amt_calc(double withdraw_amt) {
        if (withdraw_amt <= Balance) {
            System.out.println("\nConfirm? Y/N");
            String confirm = sc.next();

            if (confirm.equalsIgnoreCase("Y")) {
                Balance = Balance - withdraw_amt; // Update balance after withdrawal
                System.out.println("\nPlease Collect the Cash " + withdraw_amt + "/-"); // Display withdrawal amount
                viewBalance(); // View updated balance
            }
        } else {
            System.out.println("Insufficient Balance !!"); // Insufficient balance message
        }
    }

    // Method to calculate and handle deposit amount
    public void deposit_amt_calc(double deposit_amt) {
        System.out.println("\nConfirm? Y/N");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            Balance = Balance + deposit_amt; // Update balance after deposit
            System.out.println("\nDeposit Successfully " + deposit_amt + "/-"); // Display deposit amount
            viewBalance(); // View updated balance
        }
    }

    // Method to display transaction details
    public void view_transaction() {
        System.out.println(Balance + "/- Available balance in your account"); // Display available balance
        System.out.println(withdraw_amt + "/- Amount You Withdraw From Account"); // Display withdrawal amount
        System.out.println(deposit_amt + "/- Amount You Deposit in Account"); // Display deposit amount
    }

    // Method to calculate and handle loan amount
    public void loan_calc(int loan_amt) {
        System.out.println("\nConfirm? Y/N");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            if (loan_amt >= 10000) {
                System.out.println("\nEnter The Period Of Time (Year)");
                loan_year = sc.nextInt();
                System.out.println("\nYour Loan Is Under Processing.........");
                int loan_per = 14; // Loan percentage, represents the interest rate for the loan
                int interest_calc = (loan_amt * loan_per * loan_year) / 100; // Calculate loan interest
                System.out.println("\nTotal amount is: " + (loan_amt + interest_calc) + "/-\n"); // Display total loan amount
                System.out.println("Interest amount on " + loan_amt + " is " + interest_calc + "/-"); // Display loan interest amount
                System.out.println("\nCongrats Your Loan is Approved"); // Loan approval message
            } else {
                System.out.println("\nYou can't apply for a loan less than 10000/-"); // Loan amount requirement message
            }
        }
    }

    // Method to display the main menu and handle user choices
    public void display() {
        System.out.println("         Main_Menu         "); // Main menu title
        System.out.println();// Empty line for formatting
        System.out.println("1.View Available Balance"); // Option 1: View balance
        System.out.println("2.Withdraw Amount"); // Option 2: Withdraw amount
        System.out.println("3.Deposit Amount"); // Option 3: Deposit amount
        System.out.println("4.View Transaction"); // Option 4: View transaction details
        System.out.println("5.Apply Loan"); // Option 5: Apply for a loan
        System.out.println("6.View Details"); // Option 6: View account details

        System.out.println("\nEnter your choice :"); // Prompt for user choice
        int choice = sc.nextInt(); // Read user choice

        switch (choice) {
            case 1:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    viewBalance(); // View account balance
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            case 2:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    System.out.println("\nEnter amount to withdraw ");
                    withdraw_amt = sc.nextDouble(); // Read withdrawal amount
                    withdraw_amt_calc(withdraw_amt); // Process withdrawal
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            case 3:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    System.out.println("\nEnter amount to Deposit ");
                    deposit_amt = sc.nextDouble(); // Read deposit amount
                    deposit_amt_calc(deposit_amt); // Process deposit
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            case 4:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    System.out.println("\nYour Transaction");
                    System.out.println("***************************");
                    view_transaction(); // View transaction details
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            case 5:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    System.out.println("\nEnter the amount of Loan");
                    loan_amt = sc.nextInt(); // Read loan amount
                    loan_calc(loan_amt); // Process loan application
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            case 6:
                System.out.println("\nEnter Your Pin Please"); // Prompt for PIN number
                pin = sc.nextInt();
                if (Pin_no == pin) {
                    System.out.println("\nAccount Authorized!!"); // Authorized access message
                    System.out.println("\nYour Details is :");
                    System.out.println("***************************");
                    user_detail(); // View user details
                } else {
                    System.out.println("Incorrect pin"); // Incorrect PIN message
                    System.exit(0); // Exit program
                }
                break;

            default:
                System.out.println();// Empty line for formatting
                System.out.println("Invalid Choice Please Try Again"); // Invalid choice message
                System.out.println();// Empty line for formatting
                display(); // Display main menu again
                break;
        }

        System.out.println();// Empty line for formatting
        System.out.print("Do You Want To Go Back to MainMenu (Y/N) : \n"); // Prompt to go back to the main menu
        String again = sc.next();
        
        if (again.equalsIgnoreCase("Y")) {
            System.out.println("-----------xxxxxxxxxxxx------------\n"); // Separator line
            display(); // Display main menu again
        } else {
        	System.out.println("*********** THANK YOU ***********");
            System.exit(0); // Exit program
        }

    }

    public static void main(String[] args) {
        Bank_operation ob = new Bank_operation(); // Create Bank_operation object
        ob.accept_detail(); // Accept user details
        ob.display(); // Display the main menu
    }
}
