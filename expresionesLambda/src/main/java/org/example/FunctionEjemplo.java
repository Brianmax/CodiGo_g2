package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class FunctionEjemplo {
    public static Integer operatorLista(List<Integer> lista, Function<List<Integer>, Integer> fun){
        return fun.apply(lista);
    }
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(19);
        numeros.add(5);
        int respuesta = operatorLista(numeros, (lista)->{
            int suma = 0;
            for(Integer num: lista){
                suma = suma + num;
            }
            return suma;
        });
        System.out.println(respuesta);

        operatorLista(numeros, (lista)->{
            int mult = 1;
            for(Integer num: lista){
                mult = mult * num;
            }
            return mult;
        });
    }
}
