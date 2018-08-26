
import java.util.*;

public class Repeated_DNA_Sequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() < 10) return res;
        
        Set<Integer> set = new HashSet<Integer>();
        int[] map = new int[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;

        int i = 0;
        int sum = 0;
        while (i < 10) {
            sum = sum << 2;
            sum = sum | map[s.charAt(i) - 'A'];
            i++;
        }
        set.add(sum);
        while (i < s.length()) {
            sum = sum << 2 & 0X000FFFFF;
            sum = sum | map[s.charAt(i) - 'A'];
            if (set.contains(sum)) {
                String s2 = s.substring(i-9, i+1);
                if (!res.contains(s2)) res.add(s2);
            } else {
                set.add(sum);
            }
            i++;
        }
        return res;    
    }

	public static void main(String[] args) {

	}
}
