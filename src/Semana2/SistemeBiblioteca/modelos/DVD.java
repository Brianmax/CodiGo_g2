package Semana2.SistemeBiblioteca.modelos;
public class DVD extends LibraryItem{

    private String director;
    private short duration;
    public DVD(String title, int id, boolean status, String director, short duration){
        super(title, id, status);
        this.director = director;
        this.duration = duration;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }
}
