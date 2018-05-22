
import java.util.*;

public class Count_Primes {

    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int res = 0;
        for (int i = 2; i < n; i ++) {
            if (notPrimes[i] == false) {
                res++;
                for (int j = 2; j * i < n; j++) {
                    notPrimes[j*i] = true;
                }
            }
        }
        return res;    
    }

	public static void main(String[] args) {

	}
}
