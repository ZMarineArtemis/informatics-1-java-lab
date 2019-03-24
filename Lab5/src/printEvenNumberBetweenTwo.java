public class printEvenNumberBetweenTwo {
	public static void main(String y[]) {
		int LowerBound = Integer.parseInt(y[0]);
		int UpperBound = Integer.parseInt(y[1]);
		if (LowerBound <= UpperBound) {
			  for (int i = LowerBound; i <= UpperBound; i++) {
				  if (i % 2 == 0) {
					System.out.print(i + " ");
				  }
			  }
			
	    } else {
	    System.out.println(LowerBound + " cannot be greater than " + UpperBound);
		}
	}
}
