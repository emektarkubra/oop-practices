package org.bank.management;

public class Main {

    public static void main(String[] args)  {
        ZiraatBank ziraatBank = new ZiraatBank("Ziraat Bank");
        İşBank i̇şBank= new İşBank("İş Bank");

        Customer customer1= new Customer("kubra","emektar", "1");
        Customer customer2 = new Customer("zeliha", "emektar","2");

        ziraatBank.addCustomer(customer1);
        i̇şBank.addCustomer(customer2);

        Account account1 = new Account("1111", "kubra");
        Account account2 = new Account("2222", "zeliha");

        customer1.addAccount(account1);
        customer2.addAccount(account2);

        customer1.depositToAccount("1111",200);
        customer1.withDraw("1111", 100);

        customer2.depositToAccount("2222",300);
        customer2.withDraw("2222",50);

        ziraatBank.listCustomers();
        i̇şBank.listCustomers();

        ziraatBank.specialOffer();
        i̇şBank.specialOffer();
    }

}
