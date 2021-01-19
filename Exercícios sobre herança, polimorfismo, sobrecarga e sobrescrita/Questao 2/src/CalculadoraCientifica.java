public class CalculadoraCientifica extends Calculadora{
    public double exponenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double dividir(double num1, double num2, boolean arredodar) {
        if(arredodar){
            return Math.round(super.dividir(num1, num2));
        } else {
            return super.dividir(num1, num2);
        }
    }
}
