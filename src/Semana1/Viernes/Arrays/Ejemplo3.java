package Semana1.Viernes.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// List
public class Ejemplo3 {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); // 0
        nombres.add("George"); // 1
        System.out.println(nombres.get(0));
        Random rand = new Random();
        // ingresando otro nombre

        for (int i = 0; i < 5; i++) {
            String nombre = String.valueOf(rand.nextInt(2000));
            nombres.add(nombre);
        }

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        nombres.remove(0);
    }
}
