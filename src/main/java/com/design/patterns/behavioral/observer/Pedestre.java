package com.design.patterns.behavioral.observer;


public class Pedestre implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("Semaforo Verde para Pedestre: -> Pedestre SIM pode ir");
        }else{
            System.out.println("Semaforo Vermelho para Pedestre: -> Pedestre NAO pode passar");

        }
    }
}
