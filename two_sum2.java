


public class two_sum2 {
    public int[] twoSum(int[] numbers, int target) {
    	int[] res = new int[2];
    	int left = 0, right = numbers.length - 1;

    	res[0] = -1;
    	res[1] = -1;
    	while (left < right) {
    		if (numbers[left] + numbers[right] == target) {
    			res[0] = left+1;
    			res[1] = right+1;
    		    return res;
    		} else if (numbers[left] + numbers[right] < target) {
    			++left;
    		} else {
    			--right;
    		}
    	} 
    	return res;     
    }

	public static void main(String[] args) {

	}
}