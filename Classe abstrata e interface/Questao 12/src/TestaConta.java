public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(10);
        ContaCorrente c2 = new ContaCorrente(30);
        ContaCorrente c3 = new ContaCorrente(5);
        ContaCorrente c4 = new ContaCorrente(100);

        SeguroDeVida s1 = new SeguroDeVida();
        SeguroDeVida s2 = new SeguroDeVida();
        SeguroDeVida s3 = new SeguroDeVida();
        SeguroDeVida s4 = new SeguroDeVida();

        AuditoriaInterna ai = new AuditoriaInterna();
        ai.adicionar(c1);
        ai.adicionar(c2);
        ai.adicionar(c3);
        ai.adicionar(c4);

        ai.adicionar(s1);
        ai.adicionar(s2);
        ai.adicionar(s3);
        ai.adicionar(s4);

        System.out.println("Tributos calculados: "+ai.calcularTributos());
    }
}
