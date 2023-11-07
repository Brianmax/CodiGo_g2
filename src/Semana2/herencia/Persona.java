package Semana2.herencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    public Persona(String nombre, String apellido){
        System.out.println("Ejecutando constructor padre");
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // metodos

    public void decirHola(String nombre){
        System.out.println("Hola " + nombre);
    }
}
