package org.bank.management;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public  Account(String accountNumber,String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
       if(amount>0){
           balance+=amount;
           System.out.println("Amount successfully deposited. Current balance: " + balance);
       } else {
           System.out.println("Invalid amount. Please enter valid number");
       }
    }

    public void  withdraw(double amount){
        if(amount>balance){
            System.out.println("Your account balance is insufficient, please enter a lower amount after checking your balance.");
        }else if(amount<balance) {
            balance-= amount;
            System.out.println("You have withdrawn " + amount + " from your account. Remaining balance: " + balance);
        }else {
            System.out.println("You have withdrawn all the money from your account. Remaining balance: " + balance);
        }
    }

    public void transfer(Account otherAccount, double amount){
        if(amount<= balance){
            this.withdraw(amount);
            this.deposit(amount);
            System.out.println("Transfer successful. New balance: " + balance);;
        }
    }

    public void showAccountDetails(){
        System.out.println("Account number: " + accountNumber+ "Account holder: " + accountHolder+ "Balance: " + balance);
    }

   // getter setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
