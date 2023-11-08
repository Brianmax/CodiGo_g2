package Tutorias.loops;

import java.util.ArrayList;
import java.util.List;

public class ListasTutoria {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = {3,4,2,4,6};

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }
        // declarar una lista con 10 elementos de valor entero
        // {2,4,5,1,3,44,66,11,13,99}
        //
        System.out.println(array2.length);
        System.out.println("-----------------------");
        List<Integer> list1 = new ArrayList<>(); // lista vacia
        System.out.println(list1.toString());
        System.out.println(list1.size());
        list1.add(1);
        list1.add(49);
        list1.add(39);
        System.out.println(list1.toString());
        System.out.println(list1.size());
        // inicializamos la lista con valore
        list1.remove(1);
        System.out.println(list1.size());
        System.out.println(list1.toString());
    }
}
