package Semana2.estaticos;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumar(1,4);
        Calculadora.sumar(4,5);

        System.out.println(Usuario.count);

        // creamos un usuario
        Usuario user1 = new Usuario("George", "Maxi");

        System.out.println(Usuario.count);

        // creamos segundo usuario
        Usuario user2 = new Usuario("Nicolas", "Brody");

        System.out.println(Usuario.count);

        user2.count++;
    }
}
