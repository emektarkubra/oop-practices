package org.bank.management;

public class ZiraatBank extends Bank {


    public ZiraatBank(String bankName) {
        super("Ziraat Bankasi");
    }

    @Override
    public void specialOffer() {
        System.out.println("Ziraat Bankası: Çiftçilere özel düşük faizli kredi kampanyası!");
    }
}
