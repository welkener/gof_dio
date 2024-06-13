package com.design.patterns.structural.decorator;


public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("O crédito é de 5.000");
    }
}
