package Semana1.Lunes;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        byte edad = sc.nextByte();
        System.out.println("Ingrese la cantidad de dinero");
        byte dinero = sc.nextByte();

        if (edad >=18 && dinero>=100){
            System.out.println("Lograste ingresar");
        }
        else{
            System.out.println("Algo fallo");
        }
    }
}
