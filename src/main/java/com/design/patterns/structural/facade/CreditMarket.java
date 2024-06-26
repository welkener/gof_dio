package com.design.patterns.structural.facade;


public class CreditMarket {

    private Credit gold;
    private Credit silver;
    private Credit black;

    public CreditMarket(){
        gold = new Gold();
        silver = new Silver();
        black = new Black();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditSilver(){
        silver.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
