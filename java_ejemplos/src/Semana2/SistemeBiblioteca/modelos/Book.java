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
    @Override
    public void showInfo(){
        System.out.println("El libro tiene los siguientes datos");
        System.out.println("Title: " + this.title);
        System.out.println("Id: " + this.id);
        System.out.println("Status: " + this.status);
        System.out.println("Author: " + this.author);
    }
}
