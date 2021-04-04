package com.tddpart1.app;

public interface Expression {
    Money reduce(Bank bank, String to);
}
