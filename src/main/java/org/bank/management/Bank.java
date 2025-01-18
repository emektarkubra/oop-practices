package org.bank.management;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    private String bankName;
    private List<Customer> customerList;

    public Bank(String bankName){
        this.bankName = bankName;
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
        System.out.println(customer.getName() + "added to" + bankName);
    };
    public  Customer  getCustomers(String customerId){
        for (Customer customer: customerList){
            if(customer.getPersonId().equals(customerId)){
                return customer;
            }
        }
        return null;
    };

    public void listCustomers(){
        System.out.println("Customers");
        for (Customer customer: customerList){
            System.out.println(customer);
        }
    }

    public abstract void specialOffer();

   // getter setter
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
