
public class IsTriangular {
public static boolean isTri(double a, double b, double c) {
		if(a*a == b*b + c*c) {
			return true;
		}else {
			if(b*b == a*a + c*c) {
				return true;
		}else {
			if(c*c == a*a + b*b) {
				return true;
		}
       }
      }
     
           return false;
   }
public static void main(String[] args) {
    double a = StdIn.readDouble();
    double b = StdIn.readDouble();
    double c = StdIn.readDouble();
    
    if (isTri(a, b, c)) {
        System.out.printf("%s, %s and %s could be the lengths of a triangle\n", a, b, c);
    }
    else {
        System.out.println("Not a triangle.");
    }
}
}



