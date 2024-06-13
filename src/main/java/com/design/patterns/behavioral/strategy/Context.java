package com.design.patterns.behavioral.strategy;


public class Context {
    private StragetyTextFormatter stragetyTextFormatter;

    public Context(StragetyTextFormatter stragetyTextFormatter){
        this.stragetyTextFormatter = stragetyTextFormatter;
    }

    public void publishText(String text){
        stragetyTextFormatter.format(text);
    }
}
