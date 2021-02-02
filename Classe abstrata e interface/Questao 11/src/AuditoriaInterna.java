import java.util.ArrayList;

public class AuditoriaInterna {
    ArrayList<ITributavel> tributaveis = new ArrayList<ITributavel>();


    void adicionar(ITributavel tributavel){
        tributaveis.add(tributavel);
    };

    double calcularTributos(){
        double total = 0;
        for(ITributavel tributavel : tributaveis){
            if(tributavel!=null){
                total += tributavel.calculaTributo();
            }
        }
        return total;
    }

}
