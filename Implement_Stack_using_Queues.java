
import java.util.*;

public class Implement_Stack_using_Queues {

class MyStack {
    Queue<Integer> que;
    /** Initialize your data structure here. */
    public MyStack() {
        que = new LinkedList<Integer>();   
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        que.offer(x);
        for (int i = 0; i < que.size()-1; i++) {
            que.offer(que.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return que.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return que.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que.isEmpty();
    }

}

	public static void main(String[] args) {

	}
}
