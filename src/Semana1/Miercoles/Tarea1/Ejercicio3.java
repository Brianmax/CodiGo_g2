package Semana1.Miercoles.Tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio en metros");
        float radio = sc.nextFloat();
        float area = PI*radio*radio;
        System.out.println(area);
    }
}
