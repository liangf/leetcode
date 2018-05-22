
import java.util.*;

public class Gas_Station {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int[] remain = new int[gas.length];
        for (int i=0; i<gas.length; i++) {
            remain[i] = gas[i] - cost[i];
            sum += remain[i];
        }   
        if (sum < 0) return -1;

        int start = 0;
        sum = 0;
        for (int i = 0; i < remain.length; i++) {
            sum += remain[i];
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }
        return start;
    }


	public static void main(String[] args) {
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[] {3,4,5,1,2};


        Gas_Station gs = new Gas_Station();
        System.out.println(gs.canCompleteCircuit(gas, cost));
	}
}
