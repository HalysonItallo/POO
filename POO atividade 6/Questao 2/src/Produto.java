public class Produto {
    private int id;
    private String descricao;
    private int quantidade;
    private double valor;


    public void repor(int valor){
        this.quantidade += valor;
    }

    public void darBaixa(){
        this.quantidade -= valor;
    }
}
