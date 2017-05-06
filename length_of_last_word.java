
import java.util.*;

public class length_of_last_word {

    public int lengthOfLastWord(String s) {
        int res = 0;
        int lastIndex = s.length() - 1;
        while (lastIndex > 0) {
            if (s.charAt(lastIndex) == ' ') {
                --lastIndex;
            } else {
                break;
            }
        }
        for (int i=lastIndex; i>=0; --i) {
            if (s.charAt(i) == ' ') {
                return res;
            }
            ++res;
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
