
public class Nmax {
public static int max(int a, int b, int c) {
	if(a >= b && a >= c) {
		return a;
	}
	else if(b >= a && b >= c) {
		return b;
	}
        return c;
}
 
public static void main(String[] args) {
	int a = StdIn.readInt();
	int b = StdIn.readInt();
	int c = StdIn.readInt();
	 int maximum = max(a, b, c);
	  System.out.printf("the max value is %s\n", maximum); 
	
}
}
