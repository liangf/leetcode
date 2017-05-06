
import java.util.*;

public class valid_parentheses {

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                stk.push(s.charAt(i));
            } else {
                if (stk.empty()) {
                    return false;
                }
                char c = s.charAt(i);
                char topC = stk.peek();
                if (s.charAt(i) == ')') {
                    if (topC == '(') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (topC == '[') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (topC == '{') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stk.empty();
    }

	public static void main(String[] args) {

		System.out.println("hello");

        System.out.println(isValid("({)[]{}"));
        System.out.println(isValid("]"));
	}
}
