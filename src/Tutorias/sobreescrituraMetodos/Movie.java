package Tutorias.sobreescrituraMetodos;

public class Movie extends Rentalten{
    String director;
    String genero;

    public Movie(String nombre, int id, boolean available, String director, String genero) {
        super(nombre, id, available);
        this.director = director;
        this.genero = genero;
    }
    @Override
    public void showDetails(){
        System.out.println("PELICULA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Available: " + available);
        System.out.println("Director: " + this.director);
        System.out.println("Genero: " + this.genero);
    }
}
