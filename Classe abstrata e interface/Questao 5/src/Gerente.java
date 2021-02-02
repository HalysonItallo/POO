public class Gerente extends Funcionario{
    private int participacao;
    protected double salario;

    Gerente(double salario, int participacao){
        this.salario = salario;
        this.participacao = participacao;
    }

    @Override
    public double getBonificacao() {
        return salario+((salario*participacao)/100);
    }
}
