package Tutorias.PooRepaso;

public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    // metodos
    public Persona(String nombre, String apellido, Direccion direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    public void showDetails(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido" + this.apellido);
    }
}
