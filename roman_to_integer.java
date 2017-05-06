
import java.util.*;

public class roman_to_integer {

    // public static int romanToInt(String s) {
    //     int res = 0;
    //     HashMap<String, Integer> roman = new HashMap<String, Integer>();
    //     roman.put("I", 1);
    //     roman.put("V", 5);
    //     roman.put("X", 10);
    //     roman.put("L", 50);
    //     roman.put("C", 100);
    //     roman.put("D", 500);
    //     roman.put("M", 1000);

    //     for (int i=0; i<s.length(); ++i) {
    //         // int curVal = roman.get(Character.toString(s.charAt(i)));
    //         int curVal = roman.get(s.charAt(i)+"");
    //         // int nextVal = i == s.length() - 1 ? 0 : roman.get(Character.toString(s.charAt(i+1)));
    //         int nextVal = i == s.length() - 1 ? 0 : roman.get(s.charAt(i+1)+"");
    //         if (curVal < nextVal) {
    //             res -= curVal;
    //         } else {
    //             res += curVal;
    //         }
    //     }
    //     return res;
    // }


    public static int romanToInt(String s) {
        int res = 0;
        int[] nums = new int[s.length()];

        for (int i=0; i<s.length(); ++i) {
            switch (s.charAt(i)) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break; 
                case 'C':
                    nums[i] = 100;
                    break;                                                                                   
                case 'D':
                    nums[i] = 500;
                    break;    
                case 'M':
                    nums[i] = 1000;
                    break;                                    
            }
        }

        // for (int i=0; i<s.length(); ++i) {
        //     int curVal = nums[i];
        //     int nextVal = i == s.length()-1 ? 0 : nums[i+1];
        //     if (curVal < nextVal) {
        //         res -= curVal;
        //     } else {
        //         res += curVal;
        //     }
        // }

        for (int i=0; i<s.length()-1; ++i) {
            if (nums[i] < nums[i+1]) {
                res -= nums[i];
            } else {
                res += nums[i];
            }
        }

        return res + nums[s.length() - 1];
    }    

	public static void main(String[] args) {
		System.out.println("hello");

        System.out.println(romanToInt("I"));
        System.out.println(romanToInt("MCMLIV"));

        System.out.println(romanToInt("MMMDCLI"));
        System.out.println(romanToInt("MMMDLXXXVI"));
	}
}
