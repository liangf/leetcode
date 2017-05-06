
import java.util.*;

public class longest_valid_parentheses {
    public static int longestValidParentheses(String s) {
        int res = 0;
        Stack<Integer> stk = new Stack<Integer>();
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                if (stk.empty()) {
                    stk.push(i);
                } else {
                    int j = stk.peek();
                    if (s.charAt(j) == '(') {
                        stk.pop();
                        j = stk.peek();
                        res = Math.max(res, i - j);
                    } else {
                        stk.push(i);
                    }
                }
            }
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

        System.out.println(longestValidParentheses(")()())()()("));
	}
}
