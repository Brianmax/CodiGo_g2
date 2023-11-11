package Semana2.clasesAbstractas;

public abstract class Figura {
    private String color;
    private boolean relleno;
    public Figura(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }
    // metodos
    public abstract float area();
    public abstract float perimetro();
}
