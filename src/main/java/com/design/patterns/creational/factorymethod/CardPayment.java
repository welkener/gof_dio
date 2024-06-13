package com.design.patterns.creational.factorymethod;


public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando com cartão");
    }
}
