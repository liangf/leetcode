
import java.util.*;

public class divide_two_integers {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }


        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long res = 0;

        long sub = 1;
        while (a >= b) {
            if (sub * b <= a) {
                a -= sub * b;
                res += sub;
                sub = (sub << 1);
            } else {
                sub = (sub >> 1);
            }
        }
        if (sign > 0 && res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) res * sign;
    }

	public static void main(String[] args) {

		System.out.println("hello");

        // System.out.println(divide(1, 1));
        System.out.println(divide(-2147483648, -1));
        // System.out.println(divide(-5, -1));
	}
}
