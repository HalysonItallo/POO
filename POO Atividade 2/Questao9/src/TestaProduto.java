public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, 0, "Bolo de chocolate", 10);
        Produto p2 = new Produto(1, 3, "Bolo de chocolate", 14);

        // p1.quantidade -> 0
        p1.baixar(1);
        System.out.println(p1.quantidade);

        // p1.quantidade -> 10
        p1.repor(10);
        System.out.println(p1.quantidade);

        // p1.valor -> 11.0
        p1.reajutar(10);
        System.out.println(p1.valor);

        /*
        * codigo: 1
        * quantidade: 10
        * quantidadeMinima: 0
        * descricao: Bolo de chocolate
        * valor: 11.0
        * */
        System.out.println(p1.toString());

        //p1.equals(p2) -> true
        System.out.println(p1.equals(p2));
    }
}
