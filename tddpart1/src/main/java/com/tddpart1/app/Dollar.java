package com.tddpart1.app;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return "USD";
    }

}
