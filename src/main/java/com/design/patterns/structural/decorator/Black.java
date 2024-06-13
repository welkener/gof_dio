package com.design.patterns.structural.decorator;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("O crédito é de 1.000.000");
    }
}
