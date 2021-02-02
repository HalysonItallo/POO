public class ContaCorrente extends Conta implements ITributavel{
    private double saldo;

    @Override
    public double calculaTributo() {
        return (this.saldo*10)/100;
    }
}
