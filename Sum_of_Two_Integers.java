
import java.util.*;

public class Sum_of_Two_Integers {

    public int getSum(int a, int b) {
        if (b == 0) return a;
        
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }

	public static void main(String[] args) {

	}
}
