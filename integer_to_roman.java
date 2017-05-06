
import java.util.*;

public class integer_to_roman {

    // 99 => 90 + 9
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> roman = new HashMap<Integer, String>();
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(40, "XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400, "CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");


        int shift = 0;
        while (num != 0) {
            int base = (int) Math.pow(10, shift);
            int a = num % 10;
            if (a == 4 || a == 9) {
                // sb = sb.insert(0, roman.get(a * base));
                sb = new StringBuilder(roman.get(a * base)).append(sb);
            } else {
                if (a < 5) {
                    String tmp = "";
                    for (int i=0; i<a; ++i) {
                        tmp += roman.get(base);
                    }
                    // sb = sb.insert(0, tmp);
                    sb = new StringBuilder(tmp).append(sb);
                } else {
                    String tmp = roman.get(5*base);
                    for (int i=0; i<a-5; ++i) {
                        tmp += roman.get(base);
                    }
                    // sb = sb.insert(0, tmp);
                    sb = new StringBuilder(tmp).append(sb);
                }
            }
            ++shift;
            num = num / 10;
        }

        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println("hello");
        System.out.println(intToRoman(3999));
        System.out.println(intToRoman(4));
	}
}
