public class TestSaudacao {
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();

        saudacao.texto = "Bom dia,";
        saudacao.destinatario = " João";
        String resultadoObterSaudacao = saudacao.obterSaudacao();
        System.out.println(resultadoObterSaudacao);
    }
}
