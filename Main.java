// QUESTION NO. 1

// Package declaration
package Adarsh;

public class Main {
    public static void main(String[] args) {
        // Create an object of the CheckingAccount class
    	// Create a new CheckingAccount object with account number 123456789 and initial balance 10000.0
    	CheckingAccount account = new CheckingAccount(123456789, 10000.0);

    	// Call the deposit method to add 500.0 to the account balance
    	account.deposit(500.0);

    	// Call the withdraw method to deduct 1000.0 from the account balance
    	account.withdraw(1000.0);

    	// Call the display method to show the current account information
    	account.display();

    }
}
