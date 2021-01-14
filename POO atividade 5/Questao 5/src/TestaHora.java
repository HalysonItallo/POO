public class TestaHora {
    public static void main(String[] args) {
        Hora hora = new Hora(10,20,30);
        System.out.println(hora.getHora());
        System.out.println(hora.getMinuto());
        System.out.println(hora.getSegundo());
        hora.imprimirHora();

    }
}
