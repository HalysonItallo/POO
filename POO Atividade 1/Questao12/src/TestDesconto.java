public class TestDesconto {
    public static void main(String[] args) {
        Desconto d = new Desconto();
        d.valorOriginal = 120;
        d.valorDesconto=10;
        double resultdo = d.calcula();
        System.out.println(resultdo);
    }
}
