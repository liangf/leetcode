
import java.util.*;

public class Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length () != t.length()) return false;
        int[] maps = new int[256];
        int[] mapt = new int[256];
        
        for (int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (maps[c1] == mapt[c2]) {
                if (maps[c1] == 0) {
                    maps[c1] = i + 1;
                    mapt[c2] = i + 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
        Isomorphic_Strings is = new Isomorphic_Strings();
        System.out.println(is.isIsomorphic("ab", "aa"));
	}
}
