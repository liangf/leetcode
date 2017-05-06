
import java.util.*;

public class string_to_integer {

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        int sign = 1, start = 0;
        long res = 0;
        if (str.charAt(0) == '+') {
            start++;
        } else if (str.charAt(0) == '-') {
            start++;
            sign = -1;
        }

        for (int i=start; i<str.length(); ++i) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';
            if (sign > 0 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign < 0 && sign*res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }            
        }
        return (int) res * sign;
    }

	public static void main(String[] args) {

		System.out.println("hello");
        System.out.println(myAtoi("-1"));
        // System.out.println(myAtoi("-123"));
	}
}
