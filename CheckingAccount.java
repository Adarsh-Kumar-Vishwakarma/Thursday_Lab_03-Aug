// QUESTION NO. 1

// Package declaration
package Adarsh;

// Subclass CheckingAccount extending the abstract class BankAccount
public class CheckingAccount extends BankAccount {
	
    // Constructor of CheckingAccount class
	 public CheckingAccount(double accountNumber, double balance) {
		// Initialize the account number and balance
	        super(accountNumber, balance);
	    }
	
    // Concrete implementation of the deposit method
    @Override
    public void deposit(double amount) {
        // Updating the balance by adding the deposited amount
        setBalance(getBalance() + amount);
        // Printing the deposit transaction details
        System.out.println("Deposited: " + amount);
    }

    // Concrete implementation of the withdraw method
    @Override
    public void withdraw(double amount) {
        // Checking if there is sufficient balance in the account
        if (getBalance() >= amount) {
            // Updating the balance by subtracting the withdrawn amount
            setBalance(getBalance() - amount);
            // Printing the withdrawal transaction details
            System.out.println("Withdrawn: " + amount);
        } else {
            // If there is insufficient balance, print an error message
            System.out.println("Insufficient amount!");
        }
    }
    
    // Method to display the current balance in the account
    public void display() {
     	System.out.println("Balance is : " + getBalance() );
     	
     }
}
