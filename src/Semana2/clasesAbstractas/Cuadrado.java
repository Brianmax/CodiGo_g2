package Semana2.clasesAbstractas;

public class Cuadrado extends Figura{
    private float lado;
    public Cuadrado(String color, boolean relleno, float lado){
        super(color, relleno);
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return this.lado*4;
    }
}
