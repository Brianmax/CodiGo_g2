package Semana2.SistemeBiblioteca.modelos;

public class LibraryItem {
    protected String title;
    protected int id;
    protected boolean status;

    public LibraryItem(String title, int id, boolean status){
        this.title = title;
        this.id = id;
        this.status = status;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void showInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Id " + this.id);
        System.out.println("Status" + this.status);
    }
}