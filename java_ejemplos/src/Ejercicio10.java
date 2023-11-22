import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int t, n;
        System.out.println("Ingrese el tiempo");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        System.out.println("Ingrese la cantidad de libros");
        n = sc.nextInt();
        int suma = 0;
        List<Integer> librosTiempos = new ArrayList<>();
        int cont = 0;
        int librosLeidos = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el tiempo del libro");
            int tl = sc.nextInt();
            librosTiempos.add(tl);
            suma = suma + tl;
            if(suma > t){
                suma = suma - librosTiempos.get(cont);
                cont++;
            }
            else{
                ans++;
            }
            librosLeidos = Math.max(librosLeidos, ans);
        }
        System.out.println(librosLeidos);
    }
}
