package Semana2.SistemeBiblioteca.modelos;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private int id;
    private List<LibraryItem> libraryItemList;
    public User(String username, int id){
        this.username = username;
        this.id = id;
        this.libraryItemList = new ArrayList<>();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LibraryItem> getLibraryItemList() {
        return libraryItemList;
    }

    public void setLibraryItemList(List<LibraryItem> libraryItemList) {
        this.libraryItemList = libraryItemList;
    }
}
