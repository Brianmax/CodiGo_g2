package Semana1.Lunes;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();

        if(edad > 17){
            System.out.println("Persona mayor de edad");
        }
        else{
            System.out.println("Persona menor de edad");
        }
    }
}
