// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Semana2.POO.Perfil;
import Semana2.POO.Usuario;

public class Main {
    public static void main(String[] args) {
        Perfil perfil1 = new Perfil("foto.jpg", true, "algo@gmail.com");
        Perfil perfil2 = new Perfil("foto2.jpg", true, "algo2@gmail.com");
        Usuario user1 = new Usuario("pepito", "algo", (byte) 27, perfil1);
        Usuario user2 = new Usuario("juancito", "algo2", (byte) 34, perfil2);

        // operador punto .

       Usuario user3; // nulo
        System.out.println(user1);

        // Llamando a metodos
        user1.decirHola("George"); // hola George, soy pepito
        user2.decirHola("George"); // hola George, soy juancito


        System.out.println(user1.getUsername());


        // usuario sin perfil
        Usuario usuarioSinPerfil = new Usuario("drafos09", "password", (byte) 20);
    }
}