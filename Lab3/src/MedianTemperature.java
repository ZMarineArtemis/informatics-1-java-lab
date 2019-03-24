import java.util.Arrays;

public class MedianTemperature {
      public static void main(String[] args) {
    	  int n      = args.length;
    	  int[] nums = new int[n];
    	  
    	  System.out.print(args[0]+" ");
    	  nums[0] = Integer.parseInt(args[0]);
    	  for(int i = 1; i < n; i++) {
    		  String c = args[i];
    		  if( c.equals (".")) {
    			  nums[i] = nums[i-1];
    	       }
    		  if(c.equals("-")) {
    			  nums[i] = nums[i-1]-1;
    		  }
    		  if(c.equals("+")) {
    			  nums[i] = nums[i-1]+1;
    		  }
    		  
    	  }
    		  for(int i = 1; i<n; i++) {
    			  System.out.print (nums[i] + " ");
    			  
    		  }
       		  System.out.print("\n");
       		     Arrays.sort(nums);
       		  for(int i = 0; i<n; i++) {
    			  System.out.print (nums[i] + " ");
       		  }
       		      System.out.print("\n");
       		      int c = 0;
       		      double u = 0;
       		           if(n % 2 == 0) {
       		        	     c = (n/2);
       		        	     u = (nums[c] + nums[c-1])/2.0;
                       }else{ 
                    	     c = (n+1)/2;
                    	     u = nums[c-1];
                       }
       		        System.out.println(u);
  }
}
