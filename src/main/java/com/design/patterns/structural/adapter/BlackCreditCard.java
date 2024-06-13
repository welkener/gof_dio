package com.design.patterns.structural.adapter;


public class BlackCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        System.out.println("Cartão black");
    }

    @Override
    public void payWithSecureLevelZ() {
        //no implementar
    }
}
