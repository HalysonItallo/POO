public class Diretor extends Gerente{
    protected double salario;
    protected double participacao;

    Diretor(double salario, int participacao) {
        super(salario, participacao);
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao();
    }
}
