
import java.util.*;

public class Bitwise_AND_of_Numbers_Range {

    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (m != n) {
        	m = m >> 1;
        	n = n >> 1;
        	i++;
        }
        return m << i;
    }

	public static void main(String[] args) {

	}
}
