package Semana1.Lunes;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);

        int c = 2;
        int d = 15;
        boolean respuesta = d>=c;
        System.out.println(d >= c);  // d > c  o   d = c

        // operador ==
        System.out.println(c==d);
        String nombre1 = "George";
        String nombre2 = "George";
        System.out.println(nombre1 == nombre2);

        // operador !=

        System.out.println(nombre1!=nombre2);

        // operador &
        int variable1 = 3;
        int variable2 = 9;
        System.out.println(variable1 & variable2);

        // 0000000000000011
        // 0000000000001001
        //             0001
    }
}
