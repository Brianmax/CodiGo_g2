package Semana2.herencia;

import Semana2.POO.Perfil;
import Semana2.herencia.Persona;

public class Profesor extends Persona {
    private float salario;
    Profesor(String nombre, String apellido, float salario){
        super(nombre, apellido);
        System.out.println("Ejecutando constructur hijo");
        this.salario = salario;
    }
}
