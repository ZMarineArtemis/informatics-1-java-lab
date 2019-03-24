
public class ArithmeticSeries {
public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);
	int i = 0;
	int S = 0;
	while(i <= N) {
	 S =i + S;
	 i ++;
	}
	System.out.println(S);
}
}
