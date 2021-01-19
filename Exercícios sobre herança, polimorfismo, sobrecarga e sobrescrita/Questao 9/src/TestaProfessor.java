public class TestaProfessor {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setMatricula(1);
        System.out.println(f.getMatricula());
        f.setSalario(1000);
        System.out.println(f.getSalarioPrimeiraParcela());
        System.out.println(f.getSalarioSegundaParcela()+"\n");



        Professor p = new Professor();
        p.setNome("João");
        p.setSobrenome("Pedro");
        System.out.println(p.getNomeCompleto());
        p.setMatricula(1);
        System.out.println(p.getMatricula());
        p.setSalario(1000);
        System.out.println(p.getSalarioPrimeiraParcela());
        System.out.println(p.getSalarioSegundaParcela());
    }
}
