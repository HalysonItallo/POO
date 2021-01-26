public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros() {
        depositar((getSaldo()*(1 + taxaDeJuros/100)));
    }
}