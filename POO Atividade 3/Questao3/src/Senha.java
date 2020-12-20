public class Senha {
    String valor;

    boolean iguais(String valor){
        return this.valor.equals(valor);
    }

    boolean iguaisTrim(String valor){
        return this.valor.trim().equals(valor.trim());
    }

    boolean tamanhoSeguro(){
        return 6 <= this.valor.length();
    }

    boolean possuiMaiusculaMinuscula(){
        int contMaiuscula = 0;
        int contMiniscula = 0;
        for (int i = 0; i < this.valor.length(); i++){
            char c = valor.charAt(i);
            if((c >= 'A') && (c<= 'Z')){
                contMaiuscula++;
            }
            if((c >= 'a') && (c<= 'z')){
                contMiniscula++;
            }
        }
        if(contMaiuscula >= 1 && contMiniscula >= 1){
            return true;
        } else {
            return false;
        }
    }


    boolean possuiNumero(){
        for (int i = 0; i < this.valor.length(); i++) {

            int n = (int) valor.charAt(i);
            if ((n >= 48) && (n <= 57)) {
                return true;
            }
        }
        return false;
    }

    boolean ehValida(){
        return tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero();
    }
}
