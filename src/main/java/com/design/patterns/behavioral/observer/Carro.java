package com.design.patterns.behavioral.observer;


public class Carro implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_Carro")){
            System.out.println("Semaforo Vermelho para Carro: -> Carro NAO pode ir");
        }else{
            System.out.println("Semaforo Verde para Carro: -> Carro SIM pode ir");
        }
    }
}
