
import java.util.*;

public class copy_list_with_random_pointer {
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x;}
	}
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> hmap = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode p = dummy;

        while (head != null) {
        	if ( !hmap.containsKey(head) ) {
        		hmap.put(head, new RandomListNode(head.label));
        	} 
        	if ( !hmap.containsKey(head.random) ) {
        		if (head.random != null) {
        			hmap.put(head.random, new RandomListNode(head.random.label));
        		} else {
        			hmap.put(null, null);
        		}
        	}
        	RandomListNode n = hmap.get(head);
        	RandomListNode r = hmap.get(head.random);
        	p.next = n;
        	p.random = r;
        	
        	p = p.next;
        	head = head.next;
        }
        return dummy.next;
    }	

	public static void main(String[] args) {

	}
}