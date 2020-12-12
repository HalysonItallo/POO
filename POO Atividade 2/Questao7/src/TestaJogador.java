public class TestaJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(10,2,5);
        Jogador j2 = new Jogador(20,1,15);

        //j1.ataque() -> 25
        j1.ataque();
        //j2.ataque() -> 35
        j2.ataque();

        //j1.pontosAtuais -> 25 e j2.pontoAtuais -> 10
        j1.atacar(j2);
        //j1.pontosAtuais -> 15 e j2.pontoAtuais -> 10
        j2.atacar(j1);

        System.out.println(j1.pontosAtuais);
        System.out.println(j2.pontosAtuais);
    }
}
