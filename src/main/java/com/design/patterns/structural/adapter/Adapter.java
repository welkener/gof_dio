package com.design.patterns.structural.adapter;


public class Adapter implements Payment {

    Secure secureCreditCard;

    public Adapter(String type){
        if(type.equals("black")){
            secureCreditCard = new BlackCreditCard();
        } else if(type.equals("gold")){
            secureCreditCard = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if (type.equals("black")) {
            secureCreditCard.payWithSecureLevelA();
        } else if (type.equals("gold")) {
            secureCreditCard.payWithSecureLevelZ();
        }
    }
}
