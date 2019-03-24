
public class QuadraticSolver {
 public static void main(String[] args) {
	 double A = Double.parseDouble(args [0]);
	 double B = Double.parseDouble(args [1]);
	 double C = Double.parseDouble(args [2]);
	 double x = ((-B + Math.sqrt((B * B) - (4 * A * C))) / 2 * A);
	 double y = ((-B - Math.sqrt((B * B) - (4 * A * C))) / 2 * A);
	 System.out.println(x);
	 System.out.println(y);
 }
}
