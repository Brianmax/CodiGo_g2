package Semana2.clasesAbstractas;

public class Triangulo extends Figura{
    private float base;
    private float altura;
    public Triangulo(String color, boolean relleno, float base, float altura){
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area() {
        return base*altura/2;
    }

    @Override
    public float perimetro() {
        return 0;
    }
}
