
import java.util.*;

public class Compare_Version_Numbers {

    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");

        int length = Math.max(a.length, b.length);
        for (int i = 0; i < length; i++) {
            String sa = i < a.length ? a[i] : "0";
            String sb = i < b.length ? b[i] : "0";
            int na = Integer.parseInt(sa);
            int nb = Integer.parseInt(sb);

            if (na > nb) return 1;
            else if (na < nb) return -1;
        }
        return 0;
    }

	public static void main(String[] args) {
        Compare_Version_Numbers c = new Compare_Version_Numbers();
        // System.out.println(c.compareVersion("0.1", "1.1"));
        System.out.println(c.compareVersion("01", "1"));
	}
}
