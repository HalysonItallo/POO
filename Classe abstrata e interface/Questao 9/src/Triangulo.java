public class Triangulo implements IFiguraGeometrica, IComparavel{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;


    Triangulo(double lado1, double lado2, double base, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return lado1+lado2+base;
    }

    @Override
    public double area() {
        return base*altura;
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
