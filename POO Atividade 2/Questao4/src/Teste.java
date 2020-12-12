public class Teste {
    double valor;
    void x(double valor) {
        valor = valor + valor;
        System.out.println(valor);
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.x(10);
        t.x(4);
        //System.out.println(t.valor);
    }
}
