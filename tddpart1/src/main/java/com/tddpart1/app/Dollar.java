package com.tddpart1.app;

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }
    void times(int multiplier) {
        amount *= multiplier;
    }
}
