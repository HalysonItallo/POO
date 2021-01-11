public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        CarroEletrico carroEletrico = new CarroEletrico();

        carro.ano = 2010;
        System.out.println(carro.ano);

        carroEletrico.ano = 2020;
        System.out.println(carroEletrico.ano);
    }
}
