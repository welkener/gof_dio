package com.design.patterns.structural.adapter;


public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        //no implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Cartão Gold: Pagando seguridade nivel Z");
    }
}
