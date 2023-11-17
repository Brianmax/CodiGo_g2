package Tutorias.gestionEmpresa.app;

import Tutorias.gestionEmpresa.core.Empresa;
import Tutorias.gestionEmpresa.modelo.Desarrollador;
import Tutorias.gestionEmpresa.modelo.Diseniador;
import Tutorias.gestionEmpresa.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Empleado> lista1 = new ArrayList<>();
        lista1.add(new Desarrollador(1, "George", 10000, "www.repo.com"));
        lista1.add(new Desarrollador(2, "Rafael", 9000, "www.mirepo.com"));
        lista1.add(new Diseniador(3, "Juan", 12000, "2kds3"));
        lista1.add(new Diseniador(4, "Maria", 12000, "2n32l4"));
        Empresa empresa1 = new Empresa("AGG Constructora", lista1);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese 1 para agregar un empleado");
            System.out.println("Ingrese 2 para ver los empleados");
            int option = sc.nextInt();
            if(option==1){
                System.out.println("Ingrese P si es desarrollador y D si es diseniador");
                String optionEmpl = sc.next();
                System.out.println("Ingrese el id: ");
                int id = sc.nextInt();
                System.out.println("Ingrse el nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese el salario: ");
                float salario = sc.nextFloat();
                if(optionEmpl.equals("D")){
                    System.out.println("Ingrese el certificado: ");
                    String certificado = sc.next();
                    Diseniador empleadoAniadir = new Diseniador(id, nombre,salario, certificado);
                    empresa1.aniadirEmpleado(empleadoAniadir);
                }
                else if(optionEmpl.equals("P")){
                    System.out.println("Ingrese la url: ");
                    String url = sc.next();
                    Desarrollador empleadoDes = new Desarrollador(id, nombre, salario, url);
                    empresa1.aniadirEmpleado(empleadoDes);
                }
            }
            else if(option == 2){
                empresa1.showAll();
            }
        }
    }
}
