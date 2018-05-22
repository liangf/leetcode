
import java.util.*;

public class Delete_Node_in_a_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
 
    public void deleteNode(ListNode node) {
        if (node.next == null) {
            node = null;
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }

	public static void main(String[] args) {

	}
}
