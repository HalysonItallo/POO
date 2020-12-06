public class NumberUtils {
    int n;

    public boolean isPar(){
        if(n%2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd(){
        if(n%2 != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(){
        if(n <= 1)
        {
            return false;
        } else {
            for (int i = 2; i<= n/2; i++)
            {
                if ((n % i) == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String printCount(){
        String buildString = "";
        for (int i = 0; i < n; i++){
            if(i < n-1){
                buildString += i+", ";
            } else {
                buildString += i;
            }

        }
        return  buildString;
    }

    public String printReverseCount(){
        String buildString = "";
        for (int i = n-1; i >= 0; i--){
            if(i != 0){
                buildString += i+", ";
            } else {
                buildString += i;
            }

        }
        return  buildString;
    }
}
