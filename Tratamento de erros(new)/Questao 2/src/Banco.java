public class Banco {
    Conta[] contas;
    int indice = 0;
    int numeroMaximoContas;
    int taxaBanco = 1;

    public Banco() {
        contas = new Conta[50];
        numeroMaximoContas = 50;
    }

    public Banco(int numeroMaximoContas) {
        this.numeroMaximoContas = numeroMaximoContas;
        contas = new Conta[numeroMaximoContas];
    }

    void inserir(Conta c) {
        if(this.indice < this.numeroMaximoContas){
            contas[indice] = c;
            indice++;
        }
    }

    Conta consultar(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        throw new AplicacaoException("Não foi encontrado nenhuma conta");
    }

    int consultarIndice(String numero) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    void debitar(String numero, double valor) {
        try {
            Conta c;
            c = consultar(numero);
            if(c instanceof ContaImposto)
            {
                ((ContaImposto) c).setTaxaDesconto(taxaBanco);
                ((ContaImposto) c).debitar(valor);
            } else {
                c.sacar(valor);
            }
        } catch (AplicacaoException e){
            System.out.println(e.getMessage());
        }
    }

    void alterar(Conta c) {
        int indice = consultarIndice(c.getNumero());
        contas[indice] = c;
    }

    void excluir(String numero) {
        int posicao = consultarIndice(numero);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                contas[i] = contas[i + 1];
            }

            indice--;
        }
    }

    void renderJuros(String numero, double valor){
        try {
            Conta c;
            c = consultar(numero);
            if(!(c instanceof ContaPoupanca)) {
                throw new RuntimeException("A conta não é do tipo poupança");
            }
            c.depositar(valor);
            ((ContaPoupanca) c).setTaxaDeJuros(taxaBanco);
            ((ContaPoupanca) c).renderJuros();
        } catch (AplicacaoException e){
            System.out.println(e.getMessage());
        }

    }

    void creditar(String numero, double valor){
       try {
           Conta c;
           c = consultar(numero);
           if(c instanceof ContaPoupanca) {
               throw new RuntimeException("Essa conta é poupança");
           }
           c.depositar(valor);
       } catch (AplicacaoException e){
           System.out.println(e.getMessage());
       }
    }

    void transferir(String numCredito, String numDebito, double valor) {
        try {
            Conta c1;
            Conta c2;
            c1 = consultar(numCredito);
            c2 = consultar(numDebito);
            c2.transferir(c1, valor);
        } catch (AplicacaoException e){
            System.out.println(e.getMessage());
        }

    }

    int quantidadeContasCadastradas(){
        return this.indice;
    }

    double totalDinheiroDepositado(){
        double total = 0;
        for(int i = 0; i < quantidadeContasCadastradas(); i++){
            total += contas[i].getSaldo();
        }
        return total;
    }

    double mediaSaldoContas(){
        return totalDinheiroDepositado()/quantidadeContasCadastradas();
    }
}