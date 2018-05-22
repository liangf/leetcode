
import java.util.*;

public class Number_of_1_Bits {

    public int hammingWeight(int n) {
        if (n == 0) return 0;

        int res = 0;
        for (int i = 0; i< 32; i++) {
            if ((n & 1) == 1) {
                res += 1;
            }
            n = n >> 1;
        }   
        return res;
    }

	public static void main(String[] args) {

	}
}
