public class Conta {
    String numero;
    double saldo;

    Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    void sacar(double valor){
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void tranferir(Conta conta, double valor){
        sacar(valor);
        conta.depositar(valor);
    }
}
