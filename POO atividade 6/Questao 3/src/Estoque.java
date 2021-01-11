import javax.swing.*;
import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public boolean inserir(int id, String descricao, int quantidade, double valor){
        boolean ehValido = true;

        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getId() == id){
                ehValido = false;
                return false;
            }
        }
        if(ehValido){
            Produto p = new Produto();
            p.setValor(valor);
            p.setDescricao(descricao);
            p.setId(id);
            p.setQuantidade(quantidade);
            this.produtos.add(p);
        }
        return true;
    }

    public Produto consultar(int id){
        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getId() == id){
               return produtos.get(i);
            }
        }
        return null;
    }

    public boolean excluir(int id){
        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getId() == id){
                this.produtos.remove(i);
                return true;
            }
        }
        return false;
    }


}
