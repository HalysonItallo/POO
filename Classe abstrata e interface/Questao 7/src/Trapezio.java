public class Trapezio implements IFiguraGeometrica{
    private double baseMenor;
    private double baseMaior;
    private double lados;
    private double altura;

    Trapezio(double baseMaior, double baseMenor, double lados, double altura){
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.lados = lados;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return (lados*2)+baseMaior+baseMenor;
    }

    @Override
    public double area() {
        return ((baseMaior+baseMenor)*altura)/2;
    }
}
