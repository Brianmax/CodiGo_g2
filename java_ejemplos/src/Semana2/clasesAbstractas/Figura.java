package Semana2.clasesAbstractas;

public abstract class Figura {
    protected String color;
    protected boolean relleno;
    public Figura(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }
    // metodos
    public abstract float area();
    public abstract float perimetro();
}
