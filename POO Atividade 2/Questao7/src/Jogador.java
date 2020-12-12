public class Jogador {
    int forca, nivel, pontosAtuais;

    Jogador(int forca, int nivel, int pontosAtuais){
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    void ataque(){
        this.pontosAtuais += this.nivel * this.forca;
    }

    void atacar(Jogador jogador){
        jogador.pontosAtuais -= this.pontosAtuais;
    }

}
