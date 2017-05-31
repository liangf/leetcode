
import java.util.*;

public class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minStk;

    public MinStack() {
        stk = new Stack<Integer>();
        minStk = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (minStk.empty() || x <= minStk.peek()) {
            minStk.push(x);
        }
        stk.push(x);
    }
    
    public void pop() {
        int x = stk.pop();
        if (x <= minStk.peek()) {
            minStk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }

    public static void main(String[] args) {
    	
    }	
}