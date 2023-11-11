package Semana2.clasesAbstractas;

public class Circulo extends Figura{
    private float radio;
    private final float PI = 3.1416f;
    public Circulo(String color, boolean relleno, float radio){
        super(color, relleno);
        this.radio = radio;
    }
    @Override
    public float area() {
        return PI*radio*radio;
    }

    @Override
    public float perimetro() {
        return 2*PI*radio;
    }
}
