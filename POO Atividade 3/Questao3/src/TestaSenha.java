public class TestaSenha {
    public static void main(String[] args) {
        Senha s =  new Senha();
        s.valor = "*!zs1T";

        System.out.println(s.iguais("*!zs1T"));

        s.valor = "*!zs1T      ";
        System.out.println(s.iguaisTrim("             *!zs1T"));

        s.valor = "*!zs1Z";
        System.out.println(s.tamanhoSeguro());

        System.out.println(s.possuiMaiusculaMinuscula());

        System.out.println(s.possuiNumero());

        System.out.println(s.ehValida());
    }
}
