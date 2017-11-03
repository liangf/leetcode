
public class excel_sheet_column_title {
    
    public String convertToTitle(int n) {
    	final int len = 26;
    	StringBuffer sb = new StringBuffer();
    	while (n > 0) {
            n--;
    		sb.insert(0, (char)('A' + n % len));
    		n = n / len;
    	}
    	return sb.toString();    
    }

	public static void main(String[] args) {
		excel_sheet_column_title ex = new excel_sheet_column_title();
        System.out.println(ex.convertToTitle(27));
	}
}