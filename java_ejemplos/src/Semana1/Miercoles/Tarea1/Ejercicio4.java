package Semana1.Miercoles.Tarea1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        int a = sc.nextInt(); // 10
        System.out.println("Ingrese el segundo valor");
        int b = sc.nextInt(); // 12
        // Cambiando el valor
        int aux = a; // aux = 10
        a = b; // a = 12, b = 12
        b = aux;
        System.out.println("/////////////////////////");
        System.out.println(a);
        System.out.println(b);

        // %
    }
}
