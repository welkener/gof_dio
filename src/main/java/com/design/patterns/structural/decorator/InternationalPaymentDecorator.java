package com.design.patterns.structural.decorator;


public class InternationalPaymentDecorator extends CreditDecorator {

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment(){
        System.out.println("Cartão configurado Internacional");
    }
}
