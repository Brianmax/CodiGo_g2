package Semana1.Miercoles.Bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();
        int resultado = 0;
        for(int i = 0; i < n+1; i++)
        {
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
}
