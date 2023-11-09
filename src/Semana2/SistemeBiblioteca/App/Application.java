package Semana2.SistemeBiblioteca.App;

import Semana2.SistemeBiblioteca.core.Library;
import Semana2.SistemeBiblioteca.modelos.Book;
import Semana2.SistemeBiblioteca.modelos.DVD;
import Semana2.SistemeBiblioteca.modelos.LibraryItem;
import Semana2.SistemeBiblioteca.modelos.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Library library1 = new Library("Mario Vargas Llosa");

        // Creando Items de la biblioteca
        List<LibraryItem> libraryItems = List.of(
                new Book("The Lord of the Rings", 1, true, "J.R Tolkien"),
                new Book("It", 2, true, "Stephen King"),
                new DVD("Spiderman", 1, true, "Sam Raymi", (short) 180),
                new DVD("Juego de Tronos", 2, true, "David Benioff", (short) 1200)
        );
        // Creacion usuarios
        List<User> userList = List.of(
                new User("Jose", 1),
                new User("Andre", 2),
                new User("Mercedes", 3),
                new User("Julia", 4)

        );

        library1.setLibraryItems(libraryItems);
        library1.setUserList(userList);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Bienvenido a la biblioteca " + library1.getName());
            System.out.println("Ingrese 1 para ver los items");
            System.out.println("Ingrese 2 para ver los usuarios");
            System.out.println("Ingrese 3 para pedir un prestamo");
            int option = sc.nextInt();
            if(option==1){
                library1.showItems();
            }
            if(option==3){
                System.out.println("Ingrese su usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo");
                String titulo = sc.next();
                library1.prestamo(usuario, titulo);
            }
        }
    }
}
