package Semana1.Viernes.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese el tamanio del array");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            numeros[i] = rand.nextInt(100);
        }

        for (int i = 0; i < tamanio; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Ingrese el valor a buscar");
        int m = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanio; i++) {
            if(numeros[i]==m){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("El valor si existe");
        }
        else {
            System.out.println("El valor no existe");
        }
    }
}
