public class TestaFigura {
    public static void main(String[] args) {
        System.out.println("Quadrado");
        Quadrado q = new Quadrado(5);
        System.out.println(q.area());
        System.out.println(q.perimetro()+"\n");


        System.out.println("Triângulo");
        Triangulo t = new Triangulo(3,4,5,7);
        System.out.println(t.area());
        System.out.println(t.perimetro()+"\n");

        System.out.println("Resultado da comparação do Quadrado com o Triângulo");
        System.out.println(q.comparar(t)+"\n");


        System.out.println("Circulo");
        Circulo c = new Circulo(3);
        System.out.println(c.area());
        System.out.println(c.perimetro()+"\n");

        System.out.println("Trapezio");
        Trapezio tr = new Trapezio(8, 3, 10, 5);
        System.out.println(tr.area());
        System.out.println(tr.perimetro()+"\n");

        System.out.println("Resultado da comparação do Circulo com o Trapezio");
        System.out.println(c.comparar(tr));
    }
}
