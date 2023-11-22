package Semana2.SistemeBiblioteca.core;

import Semana2.POO.Usuario;
import Semana2.SistemeBiblioteca.modelos.LibraryItem;
import Semana2.SistemeBiblioteca.modelos.User;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private String name;
    private List<LibraryItem> libraryItems;
    private List<User> userList;
    public Library(String name){
        this.name = name;
        this.libraryItems = new ArrayList<>();
        this.userList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void showItems(){
        for(LibraryItem item: this.libraryItems){
            item.showInfo();
            System.out.println("-------------------------------");
        }
    }
    public void prestamo(String username, String title){
        User userFound = null;

        for(User user: this.userList){
            if(user.getUsername().equals(username)){
                userFound = user;
                break;
            }
        }
        if(userFound == null){
            System.out.println("Usuario no encontrado");
            return;
        }
        // verificamos si existe el recurso
        LibraryItem itemFound = null;
        for(LibraryItem item: this.libraryItems){
            if(item.getTitle().equals(title)){
                itemFound = item;
                break;
            }
        }
        if(itemFound==null){
            System.out.println("Item no encontrado");
            return;
        }
        if(itemFound.isStatus()){
            userFound.addItem(itemFound);
            itemFound.setStatus(false);
            System.out.println("Item prestado");
        }
        else {
            System.out.println("Item no disponible");
        }
    }
}
