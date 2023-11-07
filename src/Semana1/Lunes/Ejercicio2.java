package Semana1.Lunes;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();

        System.out.println("La edad es: " + edad);

        System.out.println("Ingrese su nombre: ");

        String nombre = sc.nextLine();
    }
}
