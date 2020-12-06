public class TestEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento();
        e.ligado = false;
        e.desliga();
        System.out.println(e.estaLigado());
    }
}
