
import java.util.*;

public class test2 {

    static String[] friendlyWords(String[] input) {
        int size = 0;
        if (input == null || input.length < 2) {
            return new String[]{};
        }
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i=0; i<input.length; ++i) {
            String str = input[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);  
            if (!map.containsKey(sortedStr)) {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(sortedStr, list);
            } else {
                ArrayList<String> list = map.get(sortedStr);
                list.add(str);
            }          
        }

        
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> list = entry.getValue();
            if (list.size() > 1) {
                ++size;
            }
        }  
        String[] res = new String[size];
        
        // int i = 0;
        // for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
        //     String key = entry.getKey();
        //     ArrayList<String> list = entry.getValue();
        //     if (list.size() > 1) {
        //         String str = String.join(" ", list); 
        //         res[i++] = str;
        //     }
        // }  
        int j = 0;
        for (int i=0; i<input.length; ++i) {
            String str = input[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);  
            if (map.get(sortedStr).size() > 1) {
                ArrayList<String> list = map.get(sortedStr);
                res[j++] = String.join(" ", list); 
                map.put(sortedStr, new ArrayList<String>());
            }
        }              

        return res;
    }

	public static void main(String[] args) {

        String[] str = {"car", "cheating", "dale", "deal", "lead", "listen", "silent", "teaching"};

        String[] res  = friendlyWords(str);
        for (int i=0; i<res.length; ++i) {
            System.out.println(res[i]);
        }
	}
}
