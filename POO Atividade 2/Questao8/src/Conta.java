public class Conta {
    String numero;
    double saldo;

    Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    boolean sacar(double valor){
        if (saldo - valor < 0){
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    void depositar(double valor){
        saldo += valor;
    }

    boolean tranferir(Conta conta, double valor){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }
        return false;
    }
}
