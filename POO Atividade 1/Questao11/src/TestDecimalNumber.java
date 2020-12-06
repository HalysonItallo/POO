public class TestDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber number = new DecimalNumber();

        number.number = 1.25;
        System.out.println(
            "A parte inteira: " + number.getIntegerNumber()
        );
        System.out.println(
            "A parte decimal: " + number.getDecimalNumber()
        );
    }
}
