public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public int getSegundo(){
        return this.segundo;
    }

    public void imprimirHora(){
        System.out.println(this.hora+ ":"+this.minuto+":"+this.segundo);
    }
}
