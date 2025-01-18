package org.bank.management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String personId;
    private String name;
    private String surname;
    private List<Account> accounts;

    public Customer(String name,String surname, String personId) {
        this.personId = personId;
        this.name = name;
        this.surname=surname;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added for" + name);
    }

    public Account findAccount(String accountNumber){
        for (Account account: accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    };

    public void depositToAccount(String accountNumber,double amount){
           Account account =  findAccount(accountNumber);
          if(account != null){
              account.deposit(amount);
          }else {
              System.out.println("Account not found");
          }
    }

    public void withDraw(String accountNumber, double amount){
        Account account =  findAccount(accountNumber);
        if(account != null){
            account.withdraw(amount);
        }
    }

    public void listAccounts(){
        for (Account account : accounts){
            account.showAccountDetails();
        }
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

}
