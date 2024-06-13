package com.design.patterns.creational.factorymethod;


public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Pay");
    }
}
