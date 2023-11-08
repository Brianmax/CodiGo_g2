package Tutorias.loops;

public class LoopsTutoria {
    public static void main(String[] args) {
        for(int i=10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("----------------------");
        int contador = 0;
        while(contador < 10){
            System.out.println(contador);
            contador++;
        }

        int n = 10;
        if(n%2 == 0){
            System.out.println("Es numero par");
        }
        else{
            System.out.println("Es numero impar");
        }
    }
}
