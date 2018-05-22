
import java.util.*;

public class Fraction_to_Recurring_Decimal {

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();

        sb.append(numerator>0 ^ denominator>0 ? "-" : "");
        long a = Math.abs((long) numerator);
        long b = Math.abs((long) denominator);
        sb.append(a / b);
        a = a % b;
        if (a == 0) return sb.toString();
        sb.append(".");

        Map<Long, Integer> map = new HashMap<>();
        map.put(a, sb.length());
        while (a != 0) {
            a *= 10;
            sb.append(a / b);
            a = a % b;
            if (map.containsKey(a)) {
                sb.insert(map.get(a), "(");
                sb.append(")");
                break;
            } else {
                map.put(a, sb.length());
            }
        }       
        return sb.toString();
    }

	public static void main(String[] args) {
        Fraction_to_Recurring_Decimal f = new Fraction_to_Recurring_Decimal();

        System.out.println(f.fractionToDecimal(1, 6));
	}
}
