
import java.util.*;

public class Implement_Queue_using_Stacks {
    class MyQueue {
        Stack<Integer> stk = null;
        Stack<Integer> stk2 = null;

        /** Initialize your data structure here. */
        public MyQueue() {
            stk = new Stack<Integer>();
            stk2 = new Stack<Integer>();
        }
        
        /** Push element x to the back of queue. */
        public void push(int x) {
            stk.push(x);
        }
        
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return stk2.pop();
        }
        
        /** Get the front element. */
        public int peek() {
            if (stk2.isEmpty()) {
                while (!stk.empty()) {
                    stk2.push(stk.pop());
                }
            }
            return stk2.peek();
        }
        
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stk.isEmpty() && stk2.isEmpty();
        }
    }

	public static void main(String[] args) {

	}
}
