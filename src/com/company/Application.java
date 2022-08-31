package com.company;

public class Application {

    public static void main(String[] args) {
        ATMimpl atmimpl = new ATMimpl();
        atmimpl.connection();
        atmimpl.payment();
        atmimpl.payout();
        System.out.println(Atm.endingInformation());
    }

}
