public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente(1000, 4);
        Diretor d = new Diretor(1000, 4);

        System.out.println("Gerente" + g.getBonificacao());
        System.out.println("Diretor" + d.getBonificacao());
    }
}
