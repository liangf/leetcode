
import java.util.*;

public class Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
    	Set<Integer> common = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
        	set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
        	if (set1.contains(nums2[i])) {
        		common.add(nums2[i]);
        	}
        }
        int[] res = new int[common.size()];
	   	int i = 0;
	   	for (Integer num: common) {
	   		res[i++] = num;
	   	}
        return res;        
    }

	public static void main(String[] args) {

	}
}
