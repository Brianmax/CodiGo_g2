package Semana1.Viernes.Arrays;

public class Ejemplo4 {
    public static void main(String[] args) {
        int[][] lista1 = {{1,23,4},
                          {3,4,6},
                          {34,2,6},
                          {3, 4, 5}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lista1[i][j]);
            }
        }
    }
}

// variables estaticas, sobrecarga de funciones
