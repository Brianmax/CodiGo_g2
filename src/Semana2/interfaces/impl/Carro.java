package Semana2.interfaces.impl;

import Semana2.interfaces.Motorizado;

public class Carro implements Motorizado {
    @Override
    public void encenderMotor() {
        System.out.println("Alistando embriage...");
        System.out.println("Alistando aceite...");
        System.out.println("====Encendido====");
    }
}
