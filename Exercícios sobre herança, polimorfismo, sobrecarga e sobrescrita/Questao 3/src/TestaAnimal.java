public class TestaAnimal {
    public static void main(String[] args) {
        Bovino b = new Bovino();
        b.setEspecie("Gado-doméstico");
        b.setProducaoLeite(10);
        System.out.println(b.getEspecie());
        System.out.println(b.getProducaoLeite());

        Peixe p = new Peixe();
        p.setProfundidade(20);
        p.setEspecie("Tilapia");
        System.out.println(p.getEspecie());
        System.out.println(p.getProfundidade());
    }
}
