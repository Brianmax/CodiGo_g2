package Tutorias.gestionEmpresa.modelo;

public class Diseniador extends Empleado{
    private String certificado;
    public Diseniador(int id, String nombre, float salario, String certificado){
        super(id, nombre, salario);
        this.certificado = certificado;
    }
    @Override
    public void showInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Certificado: " + certificado);
    }
}
