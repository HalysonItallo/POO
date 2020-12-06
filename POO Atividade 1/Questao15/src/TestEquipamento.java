public class TestEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento1 = new Equipamento();
        Equipamento equipamento2 = new Equipamento();

        equipamento1.liga();
        equipamento2.desliga();

        equipamento1.inverte();
        equipamento2.inverte();

        if (equipamento1.estaLigado()){
            System.out.println("Equipamento1 ligado");
        } else {
            System.out.println("Equipamento1 desligado");
        }

        if (equipamento2.estaLigado()){
            System.out.println("Equipamento2 ligado");
        } else {
            System.out.println("Equipamento2 desligado");
        }

    }
}
