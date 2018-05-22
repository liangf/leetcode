
import java.util.*;

public class Happy_Number {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();

        while (!set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n != 0) {
                int remain = n % 10;
                sum += remain * remain;
                n = n / 10;
            }
            if (sum == 1) return true;
            n = sum;
        }   
        return false;
    }

	public static void main(String[] args) {

	}
}
