
import java.util.*;

public class Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stk.pop();
                int a = stk.pop();
                int res = calculate(a, b, s);
                stk.push(res);                
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }
    public int calculate(int a, int b, String s) {
        if (s.equals("+")) return a + b;
        if (s.equals("-")) return a - b;
        if (s.equals("*")) return a * b;
        if (s.equals("/")) return a / b;
        return 0;
    }


	public static void main(String[] args) {

	}
}
