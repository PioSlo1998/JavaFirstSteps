package com.company;

public interface Atm {

    void payment();
    void payout();

    default void connection() {
        System.out.println("you're connected");
    }

    static String endingInformation() {
        return "process is over";
    }

}
