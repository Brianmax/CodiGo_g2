package Semana1.Miercoles.Bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        while(n!=1){
            if(n%2==0){
                n = n/2;
            }
            else
            {
                n = n*3+1;
            }
            System.out.println(n);
        }
    }
}
