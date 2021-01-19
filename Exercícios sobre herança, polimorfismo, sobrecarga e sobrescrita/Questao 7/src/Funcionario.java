public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setSalario(double salario) {
        if(0 <= salario){
            this.salario = salario;
        }
    }
    public double getSalario() {
        return salario;
    }

    public double getSalarioPrimeiraParcela(){
        return salario * 0.6;
    }

    public double getSalarioSegundaParcela(){
        return salario * 0.4;
    }
}
