package Semana2.herencia;

import javax.swing.text.EditorKit;

public class Estudiante extends Persona{
    private float promedio;
    Estudiante(String nombre, String apellido, float promedio){
        super(nombre, apellido);
        this.promedio = promedio;
    }
}

// clase padre: animal
// clase hija Perro
// Clase hija gato