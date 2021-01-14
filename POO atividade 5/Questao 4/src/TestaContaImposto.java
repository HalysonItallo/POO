public class TestaContaImposto {
    public static void main(String[] args) {
        ContaImposto c = new ContaImposto("1",10);
        c.creditar(10);
        c.debitar(10);
        System.out.println(c.getSaldo());
    }
}
