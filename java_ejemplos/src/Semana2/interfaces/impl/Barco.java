package Semana2.interfaces.impl;

import Semana2.interfaces.Acuatico;
import Semana2.interfaces.Motorizado;

public class Barco implements Acuatico, Motorizado {

    @Override
    public void navegar() {
        System.out.println("Navegandoooo");
    }

    @Override
    public void encenderMotor() {
        System.out.println("Alistando pistones");
        System.out.println("Alistando helices");
        System.out.println("===Encendido===");
    }
}
