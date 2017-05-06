
import java.util.*;

public class reverse_integer {

	// 123
    static int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }

	public static void main(String[] args) {

		System.out.println("hello");
		// System.out.println(reverse(-2147483648));

		// long a = Integer.MAX_VALUE + 1;
		// int b = Integer.MAX_VALUE + 1;

		// System.out.println(a > Integer.MAX_VALUE);
		// System.out.println(b > Integer.MAX_VALUE);

		System.out.println(Integer.MAX_VALUE);
		int a = 1534236469;
		long b = 964632435;
		b = b * 10;
		int c = 964632435;
		c = c * 10;
		System.out.println(b);
		System.out.println(c);
	}
}
