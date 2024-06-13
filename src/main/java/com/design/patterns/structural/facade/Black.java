package com.design.patterns.structural.facade;


public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("Cartão Black tem saldo de 1.000.000");
    }
}
