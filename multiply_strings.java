
import java.util.*;

public class multiply_strings {

    public static String multiply(String num1, String num2) {
        String res = "";
        StringBuilder sb = new StringBuilder();
        int[] pos = new int[num1.length() + num2.length()];

        for (int i=num2.length()-1; i>=0; --i) {
            for (int j=num1.length()-1; j>=0; --j) {
                int p1 = i + j;
                int p2 = i + j + 1;
                int mul = (num2.charAt(i)-'0') * (num1.charAt(j)-'0');
                int sum = pos[p2] + mul;
                pos[p2] = sum % 10; 
                pos[p1] += sum / 10; 
            }
        }

        for (int i=0; i<pos.length; ++i) {
            if (sb.length() == 0 && pos[i] == 0) {
                continue;
            }
            sb.append(pos[i]);
        }

        return sb.length()==0 ? "0" : sb.toString();
    }



	public static void main(String[] args) {

		System.out.println("hello");

        System.out.println(multiply("123", "45"));
        System.out.println(multiply("123", "0"));
	}
}
