public class ContaImposto {
    private String numero;
    private double saldo;


    ContaImposto(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        if(this.saldo - (valor + retemImposto(valor))>= 0){
            this.saldo -= valor + retemImposto(valor);
        }
    }

    private double retemImposto(double valorDebito){
        return (valorDebito * 0.38) / 100;
    }

}
