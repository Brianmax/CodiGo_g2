package Semana2.interfaces;

import Semana2.interfaces.impl.Barco;

public class App {
    public static void main(String[] args) {
        Barco barco = new Barco();
        barco.encenderMotor();
        barco.navegar();
    }
}