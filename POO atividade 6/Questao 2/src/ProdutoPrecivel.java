public class ProdutoPrecivel extends Produto{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean dataValida(String dataAtual){
        String dataValidadeDividida[] = this.dataValidade.split("/");
        String dataAtualDividida[] = dataAtual.split("/");

        if( Integer.parseInt(dataAtualDividida[2]) <= Integer.parseInt(dataValidadeDividida[2]) ) {
            if( Integer.parseInt(dataAtualDividida[1]) <= Integer.parseInt(dataValidadeDividida[1]) ){
                if( Integer.parseInt(dataAtualDividida[0]) <= Integer.parseInt(dataValidadeDividida[0]) ){
                    return true;
                }
            }
        }
        return false;
    }
}
