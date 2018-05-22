
import java.util.*;

public class Reverse_String {

    public String reverseString(String s) {
     	int i = 0; 
     	int j = s.length() - 1;
     	StringBuilder sb = new StringBuilder(s);
     	while (i < j) {
     		char tmp = s.charAt(i);
     		sb.setCharAt(i, s.charAt(j));
     		sb.setCharAt(j, tmp);
            i++;
            j--;
     	}   
     	return sb.toString();   
    }

	public static void main(String[] args) {

	}
}
