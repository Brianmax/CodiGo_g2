package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void imprimirLista(List<Integer> list, Consumer<Integer> consumer){
        for(Integer number: list){
            consumer.accept(number);
        }
    }
    public static void imprimirLista2(List<Integer> list)
    {
        for(Integer number: list){
            System.out.println("Numero lista: " + number*2);
        }
    }
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(19);
        numeros.add(5);
        Consumer<Integer> impresion = (Integer number)->{
            System.out.println(number);
        };
        imprimirLista(numeros, impresion);
    }
    public void imprimirAlgo(String nombre){
        System.out.println("Hola" + nombre);
    }
}