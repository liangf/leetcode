
public class excel_sheet_column_number {
    
    public int titleToNumber(String s) {
        int res = 0;
        while (s.length() > 0) {
            res = res * 26 + s.charAt(0) - 'A' + 1;
            s = s.substring(1);
        }    
        return res;
    }

	public static void main(String[] args) {
        excel_sheet_column_number ex = new excel_sheet_column_number();
        System.out.println(ex.titleToNumber("AA"));
	}
}