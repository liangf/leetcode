
import java.util.*;

public class palindrome_number {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } 

        int res = 0;
        int oldx = x;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res == oldx;
    }

	public static void main(String[] args) {
		System.out.println("hello");
	}
}
