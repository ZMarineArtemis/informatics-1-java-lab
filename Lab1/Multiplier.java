public class Multiplier{
	public static void main(String [] args){
		int myNumber1 = Integer.parseInt(args[ 0 ]);
		int myNumber2 = Integer.parseInt(args[ 1 ]);
		int myNumber3 = Integer.parseInt(args[ 2 ]);
		System.out.println(myNumber1 + " " + "*" + " " + myNumber2 + " " + "*" + " " + myNumber3 + " " + "=" + " " + myNumber1 * myNumber2 * myNumber3);
	}
}