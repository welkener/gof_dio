package com.design.patterns.structural.adapter;

public class CreditCard implements Payment {

    Adapter adapter;

    @Override
    public void pay(String type) {
        if(type.equals("classic")){
            System.out.println("Cartão Classico");
        } else if(type.equals("gold")){
            adapter = new Adapter("gold");
            adapter.pay("gold");
        } else if (type.equals("black")){
            adapter = new Adapter("black");
            adapter.pay("black");
        } else {
            System.out.println("Não pode realizar pagamento - cartão não reconhecido.");
        }
    }
}
