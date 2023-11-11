package Semana2.interfaces.impl;

import Semana2.interfaces.Acuatico;
import Semana2.interfaces.Motorizado;

public class Submarino implements Motorizado, Acuatico {
    @Override
    public void navegar() {
        System.out.println("viajandooo");
    }

    @Override
    public void encenderMotor() {
        System.out.println("Motores listos");
    }
}
