package Tutorias.gestionEmpresa.modelo;

public abstract class Empleado {
    protected int id; // unico
    protected String nombre;
    protected float salario;
    public Empleado(int id, String nombre, float salario){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    public abstract void showInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
