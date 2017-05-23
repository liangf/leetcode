
import java.util.*;

public class pascal_triangle2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(Arrays.asList(1));    

        for (int i=1; i<=rowIndex; ++i) {
            for (int j=res.size()-1; j>0; --j) {
                int a = res.get(j-1);
                int b = res.get(j);
                res.set(j, a + b);
            }
            res.add(1);
        }
        return res;
    }

	public static void main(String[] args) {

        System.out.println(getRow(3));
	}
}