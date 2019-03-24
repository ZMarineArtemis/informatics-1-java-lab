
public class SaferQuadraticSolver {
	public static void main(String[] args) {
		double A = Double.parseDouble(args [0]);
		double B = Double.parseDouble(args [1]);
		double C = Double.parseDouble(args [2]);
		double x = ((-B + Math.sqrt((B * B) - (4 * A * C))) / 2 * A);
		 double y = ((-B - Math.sqrt((B * B) - (4 * A * C))) / 2 * A);
		if ( (B * B - 4 * A * C) <= 0) {
			System.out.println("Equation is not solvable for real x.");
		} else {
			if(A == 0) {
				System.out.println("A=0.Cannot solve equation.");
		}else {
			  System.out.println(x);
			  System.out.println(y);
			
		}
			
	}

  }
}


