public class Calculadora {
    private int op1;
    private  int op2;

    Calculadora(int op1, int op2){
        this.op1 = op1;
        this.op2 = op2;
    }

    public int somar(){
        return this.op1 + this.op2;
    }

    public int subtrair(){
        return this.op1 - this.op2;
    }
}
