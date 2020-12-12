public class Produto {
    int codigo, quantidade, quantidadeMinima;
    String descricao;
    double valor;


    public Produto(int codigo, int quantidade, String descricao, double valor){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao =  descricao;
        this.valor = valor;
    }

    public void baixar(int quantidade){
        if(this.quantidade - quantidade > this.quantidadeMinima){
            this.quantidade -= quantidade;
        }
    }

    public void repor(int quantidade){
        this.quantidade += quantidade;
    }

    public void reajutar(double taxa){
        valor = valor + (valor * taxa) / 100;
    }

    public String toString(){
        return ("codigo: " + codigo
                + "\nquantidade: " + quantidade
                + "\nquantidadeMinima: " + quantidadeMinima
                + "\ndescricao: " + descricao
                + "\nvalor: " + valor);
    }
    public boolean equals(Produto produto){
        if(this.codigo == produto.codigo){
            return true;
        }
        return false;
    }

}
