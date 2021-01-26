import java.util.Scanner;
public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.print("1 - inserir\n2 - alterar\n3 - excluir\n4 - consultar\n" +
                    "5 - creditar\n6 - debitar\n7 - transferir\n8 - Sair\nopção >>> ");
            opcao = sc.next();
            try {
                switch (opcao) {
                    case "1" :
                        System.out.print("Qual a conta que voce deseja criar?\n1 - Conta\n2 - Conta poupança\n3 - Conta Imposto\nopção >>> ");
                        int op = sc.nextInt();
                        if(op == 1){
                            Conta c1 = new Conta();
                            System.out.print("Digite o número da conta: ");
                            c1.setNumero(sc.next ());
                            System.out.print("Digite o saldo da conta: ");
                            c1.setSaldo(sc.nextDouble());
                            b.inserir(c1);

                            System.out.println("\nConta criada com sucesso !!!\n");
                        } else if(op == 2){
                            Conta c1 = new ContaPoupanca();
                            System.out.print("Digite o número da conta: ");
                            c1.setNumero(sc.next ());
                            System.out.print("Digite o saldo da conta: ");
                            c1.setSaldo(sc.nextDouble());
                            b.inserir(c1);

                            System.out.println("\nConta criada com sucesso !!!\n");

                        } else if(op == 3){
                            Conta c1 = new ContaImposto();
                            System.out.print("Digite o número da conta: ");
                            c1.setNumero(sc.next ());
                            System.out.print("Digite o saldo da conta: ");
                            c1.setSaldo(sc.nextDouble());
                            b.inserir(c1);

                            System.out.println("\nConta criada com sucesso !!!\n");
                        } else {
                            System.out.println("Valor inválido\n");
                        }
                        break;
                    case "2" :
                        System.out.print("Digite o número da conta que você quer alterar: ");
                        String numero = sc.next ();

                        try {
                            Conta conta = b.consultar(numero);

                            System.out.print("Digite o número da conta: ");
                            conta.setNumero(sc.next());

                            System.out.print("Digite o saldo da conta: ");
                            conta.setSaldo(sc.nextDouble());

                            b.alterar(conta);
                            System.out.println("Conta alterada com sucesso!!!\n");
                        } catch (AplicacaoException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "3":
                        System.out.print("Digite o número da conta que você deseja: ");
                        numero = sc.next ();

                        try {
                            b.consultar(numero);

                            b.excluir(numero);
                            System.out.println("Conta excluída com sucesso!!!\n");
                        } catch (AplicacaoException e){

                            System.out.println(e.getMessage());
                        }
                        break;
                    case "4":
                        System.out.print("Digite o número da conta que você deseja: ");
                        numero = sc.next ();
                        try {
                            Conta conta = b.consultar(numero);
                            System.out.println(conta.getNumero());
                            System.out.println(conta.getSaldo() + "\n");
                        } catch (AplicacaoException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "5":
                        System.out.print("Digite o número da conta que você deseja creditar: ");
                        numero = sc.next ();
                        try {
                            b.consultar(numero);

                            System.out.print("Digite o valor para creditar: ");
                            double saldo = sc.nextDouble();

                            b.creditar(numero, saldo);

                            System.out.print("Valor creditada com sucesso!!!\n");
                        } catch (AplicacaoException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "6":
                        System.out.print("Digite o número da conta que você deseja debitar: ");
                        numero = sc.next ();
                        try {
                            b.consultar(numero);
                            System.out.print("Digite o valor para debitar: ");
                            double saldo = sc.nextDouble();

                            b.debitar(numero, saldo);
                            System.out.print("Valor debitado com sucesso!!!\n");
                        } catch (AplicacaoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "7":
                        System.out.print("Digite o número da conta que você deseja trasferir: ");
                        String numeroTrans = sc.next ();
                        try {
                            b.consultar(numeroTrans);
                            System.out.print("Digite o número da sua conta: ");
                            numero = sc.next ();
                            try {
                                b.consultar(numero);

                                System.out.print("Digite o valor a ser transferido: ");
                                double saldo = sc.nextDouble();

                                b.transferir(numeroTrans, numero, saldo);
                                System.out.print("Valor transferido com sucesso!!!\n");

                            } catch (AplicacaoException e){
                                System.out.println(e.getMessage());
                            }
                        } catch (AplicacaoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            } catch (AplicacaoException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Erro ao realizar operação. Contate o responsável pelo sistema.");
            }
        } while (!opcao.equals("8"));
    }
}