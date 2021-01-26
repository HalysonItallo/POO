public class ContaImposto extends Conta {
    private double taxaDesconto;

    public void debitar(double valor) {
        super.sacar(valor);
        super.sacar(valor*getTaxaDesconto()/100);
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
}