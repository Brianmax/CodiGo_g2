package Semana1.Miercoles.Bucles;

public class Ejercicio1 {
    public static void main(String[] args) {
        for(int i=0; i<7; i++){
            System.out.println(i);
        }
        // bucle while

        int contador = 0;
        while(contador < 7){
            System.out.println(contador);
            contador++;
        }

        // imprimir numeros pares
        System.out.println("-----------------------");
        for(int i=0; i<7; i=i+2){
            System.out.println(i);
        }
        int contador2 = 0;
        System.out.println("------------------------");
        while(contador2 < 7){
            System.out.println(contador2);
            contador2=contador2 + 2;
        }
    }
}
