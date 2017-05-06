
import java.util.*;

public class generate_parentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n == 0) {
            return res;
        }
        String s = "";
        help(n, n, s, res);

        return res;
    }

    public static void help(int left, int right, String s, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            help(left-1, right, s+"(", result);
        } 
        if (right > left && right > 0) {
            help(left, right-1, s+")", result);
        }
    }

	public static void main(String[] args) {

		System.out.println("hello");

        List<String> res = generateParenthesis(3);

        for (int i=0; i<res.size(); ++i) {
            System.out.println(res.get(i));
        }
	}
}
