package com.design.patterns.behavioral.strategy;


public class LowerStrategyTestFormatter implements StragetyTextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Texto Minusculo: " + text.toLowerCase());
    }
}
