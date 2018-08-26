
import java.util.*;

public class Power_of_Two {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n-1)) == 0 ? true : false;
    }

	public static void main(String[] args) {

	}
}
