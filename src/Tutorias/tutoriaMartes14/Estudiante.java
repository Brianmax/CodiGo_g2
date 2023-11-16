package Tutorias.tutoriaMartes14;

public class Estudiante extends Persona{
    private float promedio;
    public Estudiante(String nombre, String apellido, float promedio){
        super(nombre, apellido);
        this.promedio = promedio;
    }
    public void haciendoTarea(){
        System.out.println("El estudiante esta haciendo tarea");
    }
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    @Override
    public void showInfo(){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido + " Promedio: " + this.promedio);
    }
}
