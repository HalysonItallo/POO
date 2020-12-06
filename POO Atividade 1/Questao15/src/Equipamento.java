public class Equipamento {
    boolean ligado;
    boolean iniciado_liga;
    boolean iniciado_desliga;

    public void liga(){
        iniciado_liga = true;
        if(!ligado && iniciado_liga){
            ligado = true;
        } else {
            ligado = false;
        }

    }

    public void desliga(){
        iniciado_desliga = true;
        if(ligado && iniciado_desliga){
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
