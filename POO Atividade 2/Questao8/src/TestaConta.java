public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("1", 0);
        Conta c2 = new Conta("2",100);

        /*
        * c1.sacar(10) -> false
        * c1.saldo -> 0.0
        * */
        System.out.println(c1.sacar(10));
        System.out.println(c1.saldo);


        /*
         * c2.sacar(10) -> true
         * c2.saldo -> 90.0
         * */
        System.out.println(c2.sacar(10));
        System.out.println(c2.saldo);



        /*
         * c1.tranferir(c2, 10) -> false
         * c1.saldo -> 0.0
         * c2.saldo -> 90.0
         * */
        System.out.println(c1.tranferir(c2, 10));
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);


        /*
         * c2.tranferir(c1, 10) -> true
         * c1.saldo -> 10.0
         * c2.saldo -> 80.0
         * */
        System.out.println(c2.tranferir(c1, 10));
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
