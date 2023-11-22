package Semana2.estaticos;

public class Usuario {
    private String nombre;
    private String apellido;
    public static int count = 0;
    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        count++;
    }
}