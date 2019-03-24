public class Mode {

    public static void main(String[] args) {
     int n = args.length;
     int[] nums = new int[n];
     int[] count = new int[10];
     for(int i = 0; i < n; i++) {
    	 nums[i] = Integer.parseInt(args[i]);
     }
    	  for(int j = 0; j < n; j++) {
    		  count[nums[j]]++;
    	  }
     
    	  for(int i = 0; i < 10; i++) {
    	  System.out.print("[" + i + "s" + ":" + " " + count[i] + "]");
    	  System.out.print("\n");
     }
    }
}