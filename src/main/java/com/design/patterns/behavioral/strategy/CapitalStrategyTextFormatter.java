package com.design.patterns.behavioral.strategy;


public class CapitalStrategyTextFormatter implements StragetyTextFormatter  {

    @Override
    public void format(String text) {
        System.out.println("Texto em Maiusculo: " + text.toUpperCase());
    }
}
