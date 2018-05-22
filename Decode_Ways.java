
import java.util.*;

public class Decode_Ways {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()+1];

        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                if (s.charAt(i-1) != '0' && getSum(s, i-1, i)<= 26) {
                    dp[i+1] = dp[i] + dp[i-1];
                } else {
                    dp[i+1] = dp[i];
                }
            } else {
                if (getSum(s, i-1, i)>0 && getSum(s, i-1, i)<=26) {
                    dp[i+1] = dp[i-1];
                } else {
                    dp[i+1] = 0;
                }
            }
        }   
        return dp[s.length()];
    }
    int getSum(String s, int start, int end) {
        int sum = 0;
        while (start <= end) {
            sum *= 10;
            sum += s.charAt(start) - '0';
            start++;
        }
        return sum;
    }

	public static void main(String[] args) {

        // String s = "12";
        // String s = "226";
        String s = "012";
        // String s = "102";


        Decode_Ways d = new Decode_Ways();        
        System.out.println(d.numDecodings(s));
	}
}
