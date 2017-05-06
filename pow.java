
import java.util.*;

public class pow {

    public static double myPow(double x, int n) {
        long ln = (long) n;

        if (ln == 0) {
            return 1;
        }
        if (ln < 0) {
            ln = -ln;
            x = 1 / x;
        }
        double myres = myPow(x, (int)(ln/2));   
        
        if (n % 2  == 0) {
            return myres * myres; 
        } else {
            return myres * myres * x;
        }    
    }



	public static void main(String[] args) {

		System.out.println("hello");

        System.out.println(myPow(2.0, Integer.MIN_VALUE));
	}
}
