package Semana1.Miercoles.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Es numero par");
        }
        else {
            System.out.println("Es numero impar");
        }
    }
}
