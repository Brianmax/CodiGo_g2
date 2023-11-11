package Semana2.clasesAbstractas;

public class App {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("azul", true, 8f, 15f);
        Cuadrado cuadrado = new Cuadrado("rojo", true, 18f);
        System.out.println("El area del cuadrado es: " + cuadrado.area());
        System.out.println("El area del circulo es: " + triangulo.area());
    }
}
