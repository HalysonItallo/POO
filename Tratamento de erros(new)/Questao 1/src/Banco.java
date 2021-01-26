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
        Conta c = null;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                c = contas[i];
                break;
            }
        }
        throw new AplicacaoException("Não foi encontrado nenhum valor");
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
        Conta c;
        c = consultar(numero);
        if (c != null)
            if(c instanceof ContaImposto)
            {   ((ContaImposto) c).setTaxaDesconto(taxaBanco);
                ((ContaImposto) c).debitar(valor);
            } else {
                c.sacar(valor);
            }
        else
            System.out.println("Conta inexistente.");
    }

    void alterar(Conta c) {
        int indice = consultarIndice(c.getNumero());
        if (indice != -1) {
            contas[indice] = c;
        }
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

    void creditar(String numero, double valor){
        Conta c;
        c = consultar(numero);
        if (c != null){
            if(c instanceof ContaPoupanca)
            {
                c.depositar(valor);
                ((ContaPoupanca) c).setTaxaDeJuros(taxaBanco);
                ((ContaPoupanca) c).renderJuros();
                System.out.println("ContaPoupanca");

            } else {
                c.depositar(valor);
                System.out.println("Conta");
            }

        } else {
            System.out.println("Conta inexistente.");
        }
    }

    void transferir(String numCredito, String numDebito, double valor) {
        Conta c1;
        Conta c2;
        c1 = consultar(numCredito);
        c2 = consultar(numDebito);
        if (c1 != null && c2 != null) {
            c2.transferir(c1, valor);
        } else {
            System.out.println("Conta inexistente.");
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