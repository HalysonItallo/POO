public class Desconto {
    double valorOriginal;
    double valorDesconto;

    public double calcula(){
        return valorOriginal * (1-(valorDesconto/100));
    }
}
