public class Conta {
    private String numero;
    private double saldo;

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public Conta() {
        this.numero = "";
        this.saldo = 0;
    }

    Conta (String numero, double saldo){
        this.numero = numero;
        depositar(saldo);
    }

    void sacar(double valor) {
        if(saldo < valor){
            throw new AplicacaoException("Saldo insuficiente\n");
        }
        if(valor <= 0 ){
            throw new AplicacaoException("valor inválido.\n");
        }
        saldo -= valor;
    }

    void depositar(double valor) {

        if(valor <= 0){
            throw new AplicacaoException("valor inválido.\n");
        }
        saldo += valor;
    }

    double consultarSaldo() {
        return saldo;
    }

    void transferir(Conta destino, double valor) {
        saldo = saldo - valor;
        destino.saldo = destino.saldo + valor;
        //this.sacar(valor);
        //destino.depositar(valor);
    }

}