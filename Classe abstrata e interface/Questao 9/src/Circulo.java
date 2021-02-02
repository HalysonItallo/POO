public class Circulo implements IFiguraGeometrica, IComparavel {
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

    @Override
    public int comparar(IFiguraGeometrica figura) {
        if(area() < figura.area()){
            return -1;
        } else if(area() == figura.area()){
            return 0;
        } else {
            return 1;
        }
    }
}
