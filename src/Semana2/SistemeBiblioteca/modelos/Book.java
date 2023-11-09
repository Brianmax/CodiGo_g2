package Semana2.SistemeBiblioteca.modelos;

public class Book extends LibraryItem{
    private String author;
    public Book(String title, int id, boolean status, String author){
        super(title, id, status);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
