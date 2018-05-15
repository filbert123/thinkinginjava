import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static List primenumbers(int tonumber){
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= tonumber; i++) {
            boolean t = true;

            for (int j = 2; j < i; j++) {
                int rest = i % j;
                if (rest == 0) {
                    t = false;
                    break;
                }
            }
            if (t) {
                //System.out.println(i);
                primes.add(i);
            }

        }
        return primes;
    }
    public static void main(String[] args) {
        //PrimeNumbers.primenumbers(1000);
        System.out.println(PrimeNumbers.primenumbers(1000));
    }
}
