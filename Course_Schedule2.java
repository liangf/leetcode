
import java.util.*;

public class Course_Schedule2 {

    // visit, 0==>not visited, 1==>visiting, 2==>visited
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visit = new int[numCourses];
        List<Integer> order = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numCourses; i ++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0;  i < prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visit[i]==0 && !dfs(graph, i, visit, order)) {
                return new int[]{};
            }
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < order.size(); i++) {
            res[i] = order.get(i);
        }
        return res;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> graph, int v, int[] visit, List<Integer> order) {
        if (visit[v] == 1) return false;
        if (visit[v] == 2) return true;
        
        visit[v] = 1;
        for (int i = 0; i < graph.get(v).size(); i++) {
            if (!dfs(graph, graph.get(v).get(i), visit, order)) return false;
        }
        if (!order.contains(v)) order.add(v);
        visit[v] = 2; 
        return true;
    }

	public static void main(String[] args) {
        Course_Schedule2 cs = new Course_Schedule2();
        int[][] prerequisites = new int[][] {
            {1, 0}
        };
        int[] res = cs.findOrder(2, prerequisites);
	}
}
