public class Equipamento {
    boolean ligado;

    public void liga(){
        if(ligado == false){
            ligado = true;
        } else {
            ligado = false;
        }

    }

    public void desliga(){
        if(ligado == true){
            ligado = false;
        } else {
            ligado = true;
        }

    }

    public void inverte(){
        if(ligado == true){
            ligado = false;
        } else {
            ligado = true;
        }
    }

    public boolean estaLigado(){
        return ligado;
    }


}
