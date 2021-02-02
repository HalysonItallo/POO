public class Quadrado implements IFiguraGeometrica{
    private double lado;

    Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
