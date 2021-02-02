public class Circulo implements IFiguraGeometrica{
    private double r;

    Circulo(double raio){
        this.r = raio;
    }

    @Override
    public double perimetro() {
        return 2*3.14*r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }
}
