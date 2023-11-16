package Tutorias.tutoriaMartes14;

import java.security.PublicKey;

public class Profesor extends Persona{
    String titulo;
    public Profesor(String nombre, String apellido, String titulo){
        super(nombre, apellido);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public void showInfo(){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido + " Titulo: " + this.titulo);
    }
}
