
import java.util.*;

public class add_binary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;

        while (i>=0 || j>=0) {
            int x = i>=0 ? a.charAt(i) - '0' : 0;
            int y = j>=0 ? b.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            int z = sum % 2;
            carry = sum / 2;
            sb.append(z);
            --i;
            --j;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();  
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
