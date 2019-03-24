
public class MultiplesLoopRange {
		 public static void main(String[] args) {
			 int x = Integer.parseInt(args [0]);
			 int y = Integer.parseInt(args [1]);
			 int z = Integer.parseInt(args [2]);
			  if( x < y) {
		        for( int i = x; i <= y; i++ ) {
		        	if(i % z == 0) {
		        	System.out.println(i );
		           }
		        }
		 }else{
			    for( int i = x; i >= y; i--) {
			    	if(i % z == 0) {
		        	System.out.println( i );
			    	}
		    }
	   }
    }
}
