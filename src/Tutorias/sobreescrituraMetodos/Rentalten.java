package Tutorias.sobreescrituraMetodos;

public class Rentalten {
    String nombre;
    int id;
    boolean available;

    public Rentalten(String nombre, int id, boolean available) {
        this.nombre = nombre;
        this.id = id;
        this.available = available;
    }

    public void showDetails(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Available: " + available);
    }
}
