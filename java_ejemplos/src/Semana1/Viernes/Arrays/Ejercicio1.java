package Semana1.Viernes.Arrays;

import java.util.Scanner;
import java.util.Random;
// Dado un array de enteros, hallar la suma de todos sus elementos
// [3, 4, 5, 6] --> 18
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el tamanio del array");
        int tamanio = sc.nextInt();
        int[] listNumeros = new int[tamanio];

        for(int i=0; i<tamanio; i++){
            listNumeros[i] = rand.nextInt(25);
        }
        System.out.println("Imprimiendo el array");
        for(int i = 0; i< tamanio; i++){
            System.out.println(listNumeros[i]);
        }

        int suma = 0;

        for (int i = 0; i < tamanio; i++) {
            suma = suma + listNumeros[i];
        }
        System.out.println("La suma es: " + suma);
    }
}
