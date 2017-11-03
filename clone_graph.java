
import java.util.*;

public class clone_graph {
	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { 
			label = x; 
			neighbors = new ArrayList<UndirectedGraphNode>();
		}
	}

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	UndirectedGraphNode newRoot = null;
		Queue<UndirectedGraphNode> que = new LinkedList<UndirectedGraphNode>();
		Map<UndirectedGraphNode, UndirectedGraphNode> hmap = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

		que.offer(node);
		while (!que.isEmpty() && node != null) {
			Queue<UndirectedGraphNode> next = new LinkedList<UndirectedGraphNode>();
			while (!que.isEmpty()) {
				UndirectedGraphNode n = que.poll();
				if (!hmap.containsKey(n)) {
					hmap.put(n, new UndirectedGraphNode(n.label));
				}
				List<UndirectedGraphNode> newNeighbors = new ArrayList<UndirectedGraphNode>();
				List<UndirectedGraphNode> neighbors = n.neighbors;
				for (int i=0; i<neighbors.size(); ++i) {
					next.offer(neighbors.get(i));
					if (!hmap.containsKey(neighbors.get(i))) {
						hmap.put(neighbors.get(i), new UndirectedGraphNode(neighbors.get(i).label));
					}
					newNeighbors.add(hmap.get(neighbors.get(i)));
				}
				hmap.get(n).neighbors = newNeighbors;	
				if (newRoot == null) {
					newRoot = hmap.get(n);
				}
			}
			que = next;
		}
		return newRoot;	   
    }	

	public static void main(String[] args) {

	}
}