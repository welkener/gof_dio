package com.design.patterns.behavioral.state;


public class Vibration implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Vibrando...");
    }
}
