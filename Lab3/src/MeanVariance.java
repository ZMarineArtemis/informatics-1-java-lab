
public class MeanVariance {
	public static void main(String [] args) {
	int n = args.length;
	double [] array = new double[n];
	for(int i = 0; i < n; i++) {
		array[i] = Double.parseDouble(args[i]);
	}
	double sum = 0;
	for(int i = 0; i < n; i ++) {
		double temp = sum + array[i];
		sum = temp;
	}
	double mean = sum / n;
	double variance = 0;
System.out.println(mean);
 double vs = 0; 
 for(int i = 0; i < n; i++) {
	 vs = ((array[i] - mean) * (array[i] - mean))/n;
	 variance += vs;
 }

 
 System.out.print(variance);
 System.out.print("\n");
 }
}
