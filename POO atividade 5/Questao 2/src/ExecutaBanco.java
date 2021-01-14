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
            menulabel:
            switch (opcao) {
                case "1" :
                    Conta c1 = new Conta();
                    System.out.print("Digite o número da conta: ");
                    c1.numero = sc.next ();
                    System.out.print("Digite o saldo da conta: ");
                    c1.saldo = sc.nextDouble();
                    b.inserir(c1);

                    System.out.println("\nConta criada com sucesso !!!\n");
                    break;
                case "2" :
                    System.out.print("Digite o número da conta que você quer alterar: ");
                    String numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numero)) {
                            System.out.print("Digite o número da conta: ");
                            numero = sc.next();
                            System.out.print("Digite o saldo da conta: ");
                            conta.saldo = sc.nextDouble();
                            b.alterar(conta);
                            System.out.println("Conta alterada com sucesso!!!");
                            break menulabel;
                        }
                    }

                    System.out.println("Conta não encontrada");
                    break;
                case "3":
                    System.out.print("Digite o número da conta que você deseja: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numero)) {
                            b.excluir(numero);
                            System.out.println("Conta excluída com sucesso!!!");
                            break menulabel;
                        }
                    }
                    System.out.println("Não foi possível excluir a conta");
                    break;
                case "4":
                    System.out.print("Digite o número da conta que você deseja: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numero)) {
                            System.out.println(conta.numero);
                            System.out.println(conta.saldo + "\n");
                            break menulabel;
                        }
                    }
                    System.out.println("Valor inválido");
                    break;
                case "5":
                    System.out.print("Digite o número da conta que você deseja creditar: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numero)) {
                            System.out.print("Digite o valor para creditar: ");
                            double saldo = sc.nextDouble();
                            b.creditar(numero, saldo);
                            System.out.print("Valor creditada com sucesso!!!");
                            break menulabel;
                        }
                    }

                    System.out.println("Valor não foi possível ser creditado");
                    break;
                case "6":
                    System.out.print("Digite o número da conta que você deseja debitar: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numero)) {
                            System.out.print("Digite o valor para debitar: ");
                            double saldo = sc.nextDouble();

                            b.debitar(numero, saldo);
                            System.out.print("Valor debitado com sucesso!!!");
                            break menulabel;
                        }
                    }
                    System.out.println("Valor não pode ser debitado");
                    break;

                case "7":
                    System.out.print("Digite o número da conta que você deseja trasferir: ");
                    String numeroTrans = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.numero.equals(numeroTrans)) {
                            System.out.print("Digite o número da sua conta: ");
                            numero = sc.next ();
                            for(Conta conta2 : b.contas){
                                if(conta2 != null && conta2.numero.equals(numeroTrans)) {
                                    System.out.print("Digite o valor a ser transferido: ");
                                    double saldo = sc.nextDouble();

                                    b.transferir(numeroTrans, numero, saldo);
                                    System.out.print("Valor transferido com sucesso!!!");
                                    break menulabel;
                                }
                            }

                        }
                    }
                    System.out.println("Valor não pode ser transferido");
                    break;

            }
        } while (!opcao.equals("8"));
    }
}
