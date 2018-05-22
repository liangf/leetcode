
import java.util.*;

public class Median_of_Two_Sorted_Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        if (nums1.length == 0) 
            return nums2.length % 2 == 1 ? nums2[nums2.length/2] : (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
        int k = (nums1.length+nums2.length+1)/2 - 1;
        int start = 0;
        int end = nums1.length - 1;

        int m1 = 0;
        int m2 = k - m1;
        while (start < end) {
            m1 = start + (end-start)/2;
            m2 = k - m1 - 1;
            if (m2 < 0) break;
            if (nums1[m1] < nums2[m2]) {
                start = m1 + 1;
            } else {
                end = m1 - 1;
            }
        }
        m1 = start;
        m2 = k - m1 - 1;
        if (m2>=0 && nums1[m1] < nums2[m2]) m1 += 1;
        if (m2>=0 && nums1[m1] > nums2[m2]) m1 -= 1;
        m2 = k - m1 - 1;
        System.out.println(m1 + " " + m2);        
        int a = Math.max(m1<0 ? Integer.MIN_VALUE : nums1[m1], m2<0 ? Integer.MIN_VALUE : nums2[m2]);
        int b = Math.min(m1+1>=nums1.length ? Integer.MAX_VALUE : nums1[m1+1], m2+1>=nums2.length ? Integer.MAX_VALUE : nums2[m2+1]);
        if ((nums1.length+nums2.length) % 2 == 1) return a;
        return (a + b) / 2.0;  
    } 
    // private int[] getMid(int[] nums1, int[] nums2, int a1, int b1, int a2, int b2) {
    //     int[] res = new int[2];
    //     List<Integer> tmp = new ArrayList<Integer>();
    //     tmp.add(nums1[a1]);
    //     tmp.add(nums2[b1]);
    //     if (a2 < nums1.length) tmp.add(nums1[a2]);
    //     if (b2 < nums2.length) tmp.add(nums2[b2]);
    //     Collections.sort(tmp);
    //     if (tmp.size() >= 3) {
    //         res[0] = tmp.get(1);
    //         res[1] = tmp.get(2);
    //     } else {
    //         res[0] = tmp.get(0);
    //         res[1] = tmp.get(1);
    //     }
    //     return res;
    // }


    public static void main(String[] args) {
        Median_of_Two_Sorted_Arrays m = new Median_of_Two_Sorted_Arrays();

        // int[] a = {1, 2};
        // int[] b = {3, 4};

        // int[] a = {1};
        // int[] b = {1};       

        // int[] a = {1, 2};
        // int[] b = {1, 2};        

        int[] a = {1, 3};
        int[] b = {2};                  

        // int[] a = {4};
        // int[] b = {1, 2, 3};   
        System.out.println(m.findMedianSortedArrays(a, b));
    }

}