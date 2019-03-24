
public class SafterDivider {
	public static void main(String[] args) {
		double numerator = Double.parseDouble(args [0]);
		double denominator = Double.parseDouble(args [1]);
		if ( denominator == 0) {
			System.out.println("I cannot divide by zero!");
		} else {
			  System.out.println(numerator / denominator);
			
		}
			
	}

}

