package com.design.patterns.structural.facade;

public class Silver implements Credit {

    @Override
    public void showCredit() {
        System.out.println("O cartão Silver tem saldo de 200.000");
    }
}
