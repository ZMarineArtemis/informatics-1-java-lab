
public class NoTriples {
public static boolean noTriples(int[] nums) {
	int n = nums.length;
	for(int i = 0; i < n-2; i++) {
		if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
			return false;
		}
	}return true;
}
public static void main(String[] args) {
    int n = args.length;
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
        nums[i] = Integer.parseInt(args[i]);
    } 
    System.out.println(noTriples(nums));
}
}
