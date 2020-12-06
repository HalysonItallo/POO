public class TestSoma {
    public static void main(String[] args) {
        Soma s =  new Soma();
        s.num1 = 1;
        s.num2 = 2;
        int resultado = s.calcularSoma();
        System.out.println(resultado);
    }
}
