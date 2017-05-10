
import java.util.*;

public class simplify_path {

    public static String simplifyPath(String path) {
     	if (path == null || path.length() == 0) return "";

     	String[] files = path.split("/");   
     	Deque<String> que = new LinkedList<>();

     	for (int i=0; i<files.length; ++i) {
     		if (files[i].equals(".") || files[i].equals("")) {

     		} else if (files[i].equals("..")) {
     			if (!que.isEmpty()) {
     				que.pollLast();
     			}
     		} else {
     			que.offerLast(files[i]);
     		}
     	}

     	String res = "";
     	for (String s : que) {
     		res += "/" + s;
     	}
     	return res.isEmpty() ? "/" : res;
    }

	public static void main(String[] args) {

		String s = "/a/./b/c/";
		// String s = "/a/./b/../../c/";
		// String s = "/..";
		String[] arr = s.split("/");

		System.out.println(Arrays.toString(arr));

		for (int i=0; i<arr.length; ++i) {
			System.out.println("[" + arr[i] + "]");
		}

		System.out.println(simplifyPath(s));
	}
}