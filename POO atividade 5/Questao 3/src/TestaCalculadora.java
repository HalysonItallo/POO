public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(1,2);
        //Não é possível acessar
        //c.op1;
        //c.op2;

        System.out.println(c.somar());
        System.out.println(c.subtrair());
    }
}
