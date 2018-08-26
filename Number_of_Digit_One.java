
import java.util.*;

public class Number_of_Digit_One {

    public static int countDigitOne(int n) {
        int res = 0;
        int base = 1;
        int lastSumDigitOne = 0;
        int lastNum = 0;
        while (n > 0) {
            int num = n % 10;
            if (num == 1) {
                res = (lastNum+1)*1 + res + lastSumDigitOne; 
            } else if (num > 1) {
                res += 1 * base + num * lastSumDigitOne;
            }
            lastNum = num * base + lastNum;
            lastSumDigitOne = 1*base + 10*lastSumDigitOne;
            base = base * 10;
            n = n / 10;
        }
        return res;    
    }

	public static void main(String[] args) {
        System.out.println(countDigitOne(101));
	}
}
