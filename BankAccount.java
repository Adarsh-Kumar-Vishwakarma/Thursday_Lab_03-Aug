// QUESTION NO. 1

// Package declaration
package Adarsh;
//Abstract class BankAccount
abstract class BankAccount {
    // Account number of the bank account
    private double accountNumber;
    // Balance of the bank account
    private double balance;
    // Constructor to initialize the account number and balance
    public BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Getter method to get the account number
    public double getAccountNumber() {
        return accountNumber;
    }
    // Setter method to set the account number
    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }
    // Getter method to get the balance
    public double getBalance() {
        return balance;
    }
    // Setter method to set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Abstract method to deposit money into the account
    public abstract void deposit(double amount);
    // Abstract method to withdraw money from the account
    public abstract void withdraw(double amount);
}