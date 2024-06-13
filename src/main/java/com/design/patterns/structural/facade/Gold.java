package com.design.patterns.structural.facade;


public class Gold implements Credit {

    @Override
    public void showCredit() {
        System.out.println("Cartão Gold tem saldo de 5.000");
    }
}
