public class TestaFigura {
    public static void main(String[] args) {

        FiguraGeometrica[] f = new FiguraGeometrica[10];


        System.out.println("Quadrado");
        Quadrado q = new Quadrado(5);
        System.out.println(q.area());
        System.out.println(q.perimetro());

        System.out.println("Triângulo");
        Triangulo t = new Triangulo(3,4,5,7);
        System.out.println(t.area());
        System.out.println(t.perimetro());

        System.out.println("Circulo");
        Circulo c = new Circulo(3);
        System.out.println(c.area());
        System.out.println(c.perimetro());

        System.out.println("Trapezio");
        Trapezio tr = new Trapezio(8, 3, 10, 5);
        System.out.println(tr.area());
        System.out.println(tr.perimetro());
    }
}
