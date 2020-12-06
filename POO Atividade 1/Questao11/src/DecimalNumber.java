public class DecimalNumber {
    double number;

    public int getIntegerNumber(){
        return  (int) number;
    }

    public double getDecimalNumber(){
        return number - getIntegerNumber();
    }

}
