public class TestaBanco {
    public static void main(String[] args) {
        Banco contas = new Banco(2);
        Conta c1 = new Conta("1", 200);
        Conta c2 = new Conta("2", 400);
        Conta c3 = new Conta("3", 100);

        contas.inserir(c1);
        contas.inserir(c2);
        contas.inserir(c3);

        System.out.println(contas.contas.length);

        contas.transferir("1", "2", 200);
        System.out.println(contas.consultar("1").saldo);
        System.out.println(contas.consultar("2").saldo);

        System.out.println(contas.mediaSaldoContas());
    }
}
