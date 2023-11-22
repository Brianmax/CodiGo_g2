package Semana1.Miercoles.condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica");
        int matematica = sc.nextInt();
        System.out.println("Ingrese la nota de fisica");
        int fisica = sc.nextInt();
        System.out.println("Ingrese la nota de quimica");
        int quimica = sc.nextInt();
        int sumaNotas = matematica +fisica+quimica;
        int sumaFisicaMat = fisica + matematica;
        if ( ( matematica >= 65 && fisica >=55 && quimica>= 50 ) || sumaFisicaMat >= 140){
            System.out.println("Ingreso");
        }
        else{
            System.out.println("No ingreso");
        }
    }
}
