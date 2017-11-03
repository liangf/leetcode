
public class factorial_trailing_zeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        int x = 5;
        while (n >= x) {
            res += n / x;
            x = x * 5;
        }
        return res
    }
    
	public static void main(String[] args) {

	}
}