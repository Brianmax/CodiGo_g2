package Tutorias.gestionEmpresa.core;

import Tutorias.gestionEmpresa.modelo.Desarrollador;
import Tutorias.gestionEmpresa.modelo.Empleado;
import Tutorias.tutoriaMartes14.Persona;

import java.util.List;
public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre, List<Empleado> empleados){
        this.nombre = nombre;
        this.empleados  = empleados;
    }

    public boolean aniadirEmpleado(Empleado empleado){
        // verificamos el id si es positivo
        // verificamos que no sea repetido
        for(Empleado empleado_lista: empleados){
            if(empleado_lista.getId() == empleado.getId()){
                return false;
            }
        }
        empleados.add(empleado);
        return true;
    }
    public void showAll(){
        for (Empleado empleado: empleados){
            empleado.showInfo();
            System.out.println("===========================");
        }
    }
}
