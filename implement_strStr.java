
import java.util.*;

public class implement_strStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i=0; i<haystack.length(); ++i) {
            int k = i;
            for (int j=0; j<needle.length() && k<haystack.length(); ++j) {
                if (needle.charAt(j) != haystack.charAt(k)) {
                    break;
                }
                ++k;
            } 
            if (k - i == needle.length()) {
                return i;
            }
        }   
        return -1;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
