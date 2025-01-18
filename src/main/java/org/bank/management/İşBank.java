package org.bank.management;

public class İşBank extends Bank {
    public İşBank(String bankName) {
        super("İş Bankası");
    }

    @Override
    public void specialOffer() {
        System.out.println("İş Bankası: Kobilere özel esnek ödeme planı!");
    }
}
