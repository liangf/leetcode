
import java.util.*;

public class zigzag_conversion {

    public static String convert(String s, int numRows) {
        String res = "";
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int m=0; m<numRows; ++m) {
            rows[m] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            int m = 0;
            for (; m<numRows && i<s.length(); ++m) {
                rows[m] = rows[m].append(s.charAt(i++));
            }
            for (m=m-2; m>0 && i<s.length(); --m) {
                rows[m] = rows[m].append(s.charAt(i++));
            }
        }

        for (int m=0; m<rows.length; ++m) {
            res += rows[m];
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");
        System.out.println(convert("PAYPALISHIRING", 3));
	}
}
