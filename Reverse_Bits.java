
import java.util.*;

public class Reverse_Bits {

    public int reverseBits(int n) {
        if (n == 0) return 0;
        int res = 0;

        for (int i = 0; i < 32; i++) {
            res = res << 1;
            if ((1 & n) == 1) {
                res += 1;
            }
            n = n >> 1;
        }   
        return res;
    }

	public static void main(String[] args) {

	}
}
