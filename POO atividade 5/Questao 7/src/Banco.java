public class Banco {
    private Conta[] contas;
    private int indice = 0;
    int numeroMaximoContas;

    public Banco() {
        contas = new Conta[50];
    }

    public Banco(int numeroMaximoContas) {
        this.numeroMaximoContas = numeroMaximoContas;
        contas = new Conta[numeroMaximoContas];
    }

    public void inserir(Conta c) {
        if(this.indice < this.numeroMaximoContas){
            contas[indice] = c;
            indice++;
        }
    }

    public Conta consultar(String numero) {
        Conta c = null;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                c = contas[i];
                break;
            }
        }
        return c;
    }

   private int consultarIndice(String numero) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void debitar(String numero, double valor) {
        Conta c;
        c = consultar(numero);
        if (c != null)
            c.sacar(valor);
        else
            System.out.println("Conta inexistente.");
    }

    public void alterar(Conta c) {
        int indice = consultarIndice(c.getNumero());
        if (indice != -1) {
            contas[indice] = c;
        }

    }

    public void excluir(String numero) {
        int posicao = consultarIndice(numero);
        if (posicao != -1) {
            for (int i = posicao; i < indice; i++) {
                contas[i] = contas[i + 1];
            }

            indice--;
        }
    }

    public void creditar(String numero, double valor){
        Conta c;
        c = consultar(numero);
        if (c != null){
            c.depositar(valor);
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void transferir(String numCredito, String numDebito, double valor) {
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

    public int quantidadeContasCadastradas(){
        return this.indice;
    }

    public double totalDinheiroDepositado(){
        double total = 0;
        for(int i = 0; i < quantidadeContasCadastradas(); i++){
            total += contas[i].getSaldo();
        }
        return total;
    }

    public double mediaSaldoContas(){
        return totalDinheiroDepositado()/quantidadeContasCadastradas();
    }

}