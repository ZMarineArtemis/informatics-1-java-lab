
public class SquaresLoopRange {
 public static void main(String[] args) {
	 int x = Integer.parseInt(args [0]);
	 int y = Integer.parseInt(args [1]);
	  if( x <= y) {
        for( int i = x; i <= y; i++ ) {
        	System.out.println(i * i);
        }
 }else { 
	        System.out.println("Start-limit greater than stop-limit!");
    }
  }
}