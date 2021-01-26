public class Teste {
    public static void main(String args[]) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e2) {
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
}