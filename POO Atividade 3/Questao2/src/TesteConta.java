public class TesteConta {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        contas[0] = new Conta("1",0);
        contas[0].saldo = 10;
        System.out.println(contas[0].saldo);
    }
}
