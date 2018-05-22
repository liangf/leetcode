
import java.util.*;

public class Course_Schedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<List<Integer>>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        // status 1 == visiting, 2 == visited
        int[] status = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if ( dfs(i, graph, status) ) return false;
        }
        return true;
    }

    public boolean dfs(int v, List<List<Integer>> graph, int[] status) {
        // the point is visiting, have cycle
        if (status[v] == 1) return true;
        if (status[v] == 2) return false;

        status[v] = 1;
        // visited the neighbors
        for (int i = 0; i < graph.get(v).size(); i++) {
            if ( dfs(graph.get(v).get(i), graph, status) ) return true;
        }
        status[v] = 2;
        return false;
    }
	
	public static void main(String[] args) {

	}	
}