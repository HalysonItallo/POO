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

    Conta() {
        this.numero = "";
        this.saldo = 0;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
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