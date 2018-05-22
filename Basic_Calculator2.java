
import java.util.*;

public class Basic_Calculator2 {

    // public int calculate(String s) {
    //     if (s == null || s.length() == 0) return 0;
    //     List<StringBuilder> list = new ArrayList<StringBuilder>();

    //     boolean firstDigit = true;
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == ' ') continue;
    //         StringBuilder sb = new StringBuilder();
    //         if ( isDigit(s.charAt(i)) ) {
    //             if (firstDigit) {
    //                 list.add(sb.append(s.charAt(i)));
    //             } else {
    //                 list.get(list.size()-1).append(s.charAt(i));
    //             }
    //             firstDigit = false;
    //         } else {
    //             if (list.size() > 2) {
    //                 String s2 = list.get(list.size()-1).toString();
    //                 String op = list.get(list.size()-2).toString();
    //                 String s1 = list.get(list.size()-3).toString(); 
    //                 if (op.equals("*") || op.equals("/")) {
    //                     list.subList(list.size()-3, list.size()).clear();
    //                     list.add(new StringBuilder(getVal(s1, s2, op)));
    //                 }                
    //             }                 
    //             list.add(sb.append(s.charAt(i)));
    //             firstDigit = true;
    //         }
    //     }
    //     if (list.size() > 2) {
    //         String s2 = list.get(list.size()-1).toString();
    //         String op = list.get(list.size()-2).toString();
    //         String s1 = list.get(list.size()-3).toString(); 
    //         if (op.equals("*") || op.equals("/")) {
    //             list.subList(list.size()-3, list.size()).clear();
    //             list.add(new StringBuilder(getVal(s1, s2, op)));
    //         }             
    //     }
    //     while (list.size() > 1) {
    //         String s1 = list.get(0).toString();
    //         String op = list.get(1).toString();
    //         String s2 = list.get(2).toString();
    //         list.subList(0, 2).clear();
    //         list.set(0, new StringBuilder(getVal(s1, s2, op)));
    //     }
    //     return Integer.valueOf(list.get(0).toString());
    // }
    // String getVal(String s1, String s2, String op) {
    //     int a = Integer.valueOf(s1);
    //     int b = Integer.valueOf(s2);
    //     int res = 0;
    //     if (op.equals("+")) res = a + b;
    //     else if (op.equals("-")) res = a - b;
    //     else if (op.equals("*")) res = a * b;
    //     else if (op.equals("/")) res = a / b;
    //     return Integer.toString(res);
    // }
    // boolean isDigit(char c) {
    //     if (c-'0' >=0 && c-'0' <= 9) return true;
    //     return false;
    // }


    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        int num = 0;
        char lastSign = '+';
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i <= s.length(); i++) {
            if (i<s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            } else {
                if (i < s.length() && s.charAt(i) == ' ') continue;
                if (lastSign == '+') stk.push(num);
                if (lastSign == '-') stk.push(-num);
                if (lastSign == '*') stk.push(stk.pop() * num);
                if (lastSign == '/') stk.push(stk.pop() / num);
                lastSign = i<s.length() ? s.charAt(i) : '+';
                num = 0;
            }
        }
        int res = 0;
        while(!stk.isEmpty()) {
            res += stk.pop();
        }
        return res;
    }
	public static void main(String[] args) {
        Basic_Calculator2 bc = new Basic_Calculator2();
        System.out.println(bc.calculate("3+2*2"));
        System.out.println(bc.calculate("34+2*2"));
        System.out.println(bc.calculate(" 3/2 "));
        // System.out.println(bc.calculate("1-1+1"));
        // System.out.println(bc.calculate("0-2147483647"));
	}
}
