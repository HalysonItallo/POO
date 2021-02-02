public class Quadrado implements IFiguraGeometrica, IComparavel{
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
