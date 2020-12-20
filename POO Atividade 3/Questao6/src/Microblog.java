public class Microblog {
    Postagem[] postagems;
    int indice;

    Microblog(int tamanho){
        this.postagems =  new Postagem[tamanho];
    }

    void inserirPostagem(Postagem postagem) {
        if(indice < postagems.length){
            postagems[indice] = postagem;
            indice++;
        }
    }

    int consultarIndice(int id) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (postagems[i].id == id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    void excluir(int id) {
        int posicao = consultarIndice(id);
        if (posicao != -1) {
            if(indice == postagems.length) {
                for (int i = posicao; i < indice; i++) {
                    if(i == indice - 1){
                        postagems[i] = null;
                    } else {
                        postagems[i] = postagems[i + 1];
                    }
                }
            } else {
                for (int i = posicao; i < indice; i++) {
                    postagems[i] = postagems[i + 1];
                }
            }

            indice--;
        } else {
            System.out.println("Não foi possível realizar a exclusão");
        }
    }



    Postagem maisCurtidas(){
        int maior = postagems[0].qtdCurtidas;
        Postagem objetoMaior = postagems[0];
        for(int i = 1; i < indice;i++){
            if(maior < postagems[i].qtdCurtidas){
                maior = postagems[i].qtdCurtidas;
                objetoMaior = postagems[i];
            }
        }
        return objetoMaior;
    }

    void curtir(int id){
        int posicao =  consultarIndice(id);
        postagems[posicao].curtir();
    }
}
