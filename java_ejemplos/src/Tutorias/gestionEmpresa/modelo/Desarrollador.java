package Tutorias.gestionEmpresa.modelo;

public class Desarrollador extends Empleado{
    private String url;
    public Desarrollador(int id, String nombre, float salario, String url){
        super(id, nombre, salario);
        this.url = url;
    }
    @Override
    public void showInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Url: " + url);
    }
}
