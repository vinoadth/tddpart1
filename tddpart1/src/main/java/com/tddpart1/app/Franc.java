package com.tddpart1.app;

public class Franc extends Money {

    Franc(int amount, String current) {
        super(amount, current);
    }

    @Override
    String currency() {
        return "CHF";
    }

}
