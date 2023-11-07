package Semana1.Viernes.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {
        int[] values = new int[5];

        System.out.println(values[3]);
        values[3] = 24;
        System.out.println(values[3]);
        System.out.println("------------------");
        for(int i = 0; i < 5; i++){
            System.out.println(values[i]);
        }
    }

}
