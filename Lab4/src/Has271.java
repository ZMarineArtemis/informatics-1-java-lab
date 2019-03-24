
public class Has271 {
public static boolean has271(int[] nums) {
	int x = 0;
	int n = nums.length;
	for(int i = 0; i < n-2; i++) {
		x = nums[i]; 
		if( nums[i+1] == (x+5) && nums[i+2] == (x-1)) {
			return true;
		}
	}return false;
}
public static void main(String[] args) {
	int n = args.length;
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
        nums[i] = Integer.parseInt(args[i]);
    } 
	 System.out.println(has271(nums));
}
}


