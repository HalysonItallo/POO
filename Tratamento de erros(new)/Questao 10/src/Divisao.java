public class Divisao {
    public double calcular(String n1, String n2){
        int num1;
        int num2;

        try {
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
        } catch (Exception e){
            throw new TipoExcecao1("Informe um número");
        }

        if(num2 == 0){
            throw new TipoExcecao2("Não é possível um divisão por zero");
        }

        return num1 / num2;
    }
}
