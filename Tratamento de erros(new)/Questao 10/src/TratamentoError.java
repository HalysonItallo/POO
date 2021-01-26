import java.util.InputMismatchException;
import java.util.Scanner;


public class TratamentoError {
    public static int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;

        try{
            System.out.print("Digite o primeiro número: ");
            String num1 = sc.next();

            System.out.print("Digite o segundo número: ");
            String num2 = sc.next();

            Divisao divisao = new Divisao();

            resultado = divisao.calcular(num1, num2);
        } catch (TipoExcecao1 e) {
            System.out.println(e.getMessage());
        } catch(TipoExcecao2 e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Resultado: "+ resultado);
        }
    }
}
