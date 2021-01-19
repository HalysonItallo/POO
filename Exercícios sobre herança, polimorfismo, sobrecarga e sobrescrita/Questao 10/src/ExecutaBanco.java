import javax.sound.midi.Soundbank;
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
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numero)) {
                            System.out.print("Digite o número da conta: ");
                            numero = sc.next();
                            System.out.print("Digite o saldo da conta: ");
                            conta.setSaldo(sc.nextDouble());
                            b.alterar(conta);
                            System.out.println("Conta alterada com sucesso!!!\n");
                            break menulabel;
                        }
                    }

                    System.out.println("Conta não encontrada");
                    break;
                case "3":
                    System.out.print("Digite o número da conta que você deseja: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numero)) {
                            b.excluir(numero);
                            System.out.println("Conta excluída com sucesso!!!\n");
                            break menulabel;
                        }
                    }
                    System.out.println("Não foi possível excluir a conta\n");
                    break;
                case "4":
                    System.out.print("Digite o número da conta que você deseja: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numero)) {
                            System.out.println(conta.getNumero());
                            System.out.println(conta.getSaldo() + "\n");
                            break menulabel;
                        }
                    }
                    System.out.println("Valor inválido");
                    break;
                case "5":
                    System.out.print("Digite o número da conta que você deseja creditar: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numero)) {
                            System.out.print("Digite o valor para creditar: ");
                            double saldo = sc.nextDouble();
                            b.creditar(numero, saldo);
                            System.out.print("Valor creditada com sucesso!!!\n");
                            break menulabel;
                        }
                    }

                    System.out.println("Valor não foi possível ser creditado\n");
                    break;
                case "6":
                    System.out.print("Digite o número da conta que você deseja debitar: ");
                    numero = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numero)) {
                            System.out.print("Digite o valor para debitar: ");
                            double saldo = sc.nextDouble();

                            b.debitar(numero, saldo);
                            System.out.print("Valor debitado com sucesso!!!\n");
                            break menulabel;
                        }
                    }
                    System.out.println("Valor não pode ser debitado\n");
                    break;

                case "7":
                    System.out.print("Digite o número da conta que você deseja trasferir: ");
                    String numeroTrans = sc.next ();
                    for(Conta conta : b.contas){
                        if(conta != null && conta.getNumero().equals(numeroTrans)) {
                            System.out.print("Digite o número da sua conta: ");
                            numero = sc.next ();
                            for(Conta conta2 : b.contas){
                                if(conta2 != null && conta2.getNumero().equals(numeroTrans)) {
                                    System.out.print("Digite o valor a ser transferido: ");
                                    double saldo = sc.nextDouble();

                                    b.transferir(numeroTrans, numero, saldo);
                                    System.out.print("Valor transferido com sucesso!!!\n");
                                    break menulabel;
                                }
                            }

                        }
                    }
                    System.out.println("Valor não pode ser transferido\n");
                    break;

            }
        } while (!opcao.equals("8"));
    }
}