package com.design.patterns.creational.abstractfactory;


public class Credit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago no Crédito";
    }
}
