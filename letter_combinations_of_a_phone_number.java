
import java.util.*;

public class letter_combinations_of_a_phone_number {

    public static List<String> letterCombinations(String digits) {
        String res = "";
        List<String> sol = new ArrayList<String>();
        Map<Character, String> hmap = new HashMap<Character, String>();
        hmap.put('2', "abc");
        hmap.put('3', "def");
        hmap.put('4', "ghi");
        hmap.put('5', "jkl");
        hmap.put('6', "mno");
        hmap.put('7', "pqrs");
        hmap.put('8', "tuv");
        hmap.put('9', "wxyz");

        help(digits, 0, hmap, res, sol);
        return sol;
    }

    public static void help(String digits, int pos, Map<Character, String> hmap, String res, List<String> sol) {
        if (pos == digits.length()) {
            sol.add(res);
            return;
        }
        Character c = digits.charAt(pos);
        String s = hmap.get(c);
        for (int j=0; j<s.length(); ++j) {
            res += Character.toString(s.charAt(j));
            help(digits, pos+1, hmap, res, sol);
            res = res.substring(0, res.length()-1);
        }
    }


    public static void test(List<String> res, String s) {
        // res = new ArrayList<String>();
        res.add("123456");
        res.add("avadfa");

        s = "123456789";
    }


	public static void main(String[] args) {
		System.out.println("hello");

        List<String> res = letterCombinations("23");
        for (int i=0; i<res.size(); ++i) {
            System.out.println(res.get(i));
        }

        letter_combinations_of_a_phone_number A = new letter_combinations_of_a_phone_number();
        List<String> ls = new ArrayList<String>();
        String s1 = "bbb";
        A.test(ls, s1);

        System.out.println(s1);
        for (int i=0; i<ls.size(); ++i) {
            System.out.println(ls.get(i));
        }
        System.out.println("~~~~~~~~~~~~");
        test(ls, s1);

        System.out.println(s1);
        for (int i=0; i<ls.size(); ++i) {
            System.out.println(ls.get(i));
        }        
	}
}
