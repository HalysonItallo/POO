public class Postagem {
    int id, qtdCurtidas;
    String texto;

    Postagem(int id, String texto){
        this.id = id;
        this.texto = texto;
    }

    void curtir(){
        qtdCurtidas++;
    }

    public String toString() {
        return "Postagem{" +
                "id=" + id +
                ", qtdCurtidas=" + qtdCurtidas +
                ", texto='" + texto + '\'' +
                '}';
    }
}
