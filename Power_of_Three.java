
import java.util.*;

public class Power_of_Three {

    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
        	n = n / 3;
        }
        return n == 1;
    }

	public static void main(String[] args) {

	}
}
