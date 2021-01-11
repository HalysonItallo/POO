public class TestaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        System.out.println(estoque.inserir(1,"Test", 10, 20.00));
        System.out.println(estoque.inserir(2,"Test", 10, 20.00));

        System.out.println(estoque.consultar(2).getId());

        System.out.println(estoque.excluir(3));
    }
}
