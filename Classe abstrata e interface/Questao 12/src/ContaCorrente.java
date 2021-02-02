public class ContaCorrente extends Conta implements ITributavel{
    private double saldo;

    ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    @Override
    public double calculaTributo() {
        return (this.saldo*10)/100;
    }
}
