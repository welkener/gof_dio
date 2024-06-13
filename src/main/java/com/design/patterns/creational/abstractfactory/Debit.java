package com.design.patterns.creational.abstractfactory;


public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago no Débito";
    }
}
