package Tutorias.PooRepaso;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle1", (byte) 39, "Arequipa");
        Persona persona1 = new Persona("George", "Maxi", direccion1);
        Persona persona2 = new Persona("Jose", "Sardon", new Direccion("Calle2", (byte) 3, "Lima"));
    }
}