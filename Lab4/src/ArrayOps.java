public class ArrayOps {

    public static double findMax(double[] data) {
        // ADD CODE HERE
    	int n = data.length;
    	double max = data[0];
    		for(int i = 0; i < n; i++) {
    			if(data[i] > max) {
    				max = data[i];
    			}
    	}
    	return max;
    }

    public static double[] normalise(double data[]) {
        // ADD CODE HERE
    	int n = data.length;
    	double sum = data[0];
    	for(int i = 1; i < n; i++) {
    		sum = data[i] + sum;
    	}
    	double[] normal = new double[n];
    	for(int i = 0; i < n; i++) {
    		normal[i] = data[i]/sum; 
    	}
    	return normal;
    }

    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
    	int n = data.length;
    	double sum = data[0];
    	for(int i = 1; i < n; i++) {
    		sum = data[i] + sum;
    	}
    	for(int i = 0; i < n; i++) {
    		data[i] = data[i]/sum; 
    	}

    }
    

    public static double[] reverse(double[] data) {
        // ADD CODE HERE
    	int n = data.length;
    	double[] reversearray = new double[n];
    	for(int i = 0; i < n; i++) {
    		reversearray[i] = data[n-1-i];
    	}
    	return reversearray;
    }

    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE
    	 for (int i = 0; i < data.length / 2; i++) {
    	 double tmp = data[i];
         data[i] = data[data.length - 1 - i];
         data[data.length - 1 - i] = tmp;
     }
    }
    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
    	int n = data1.length;
    	int u = data2.length;
        int c = Math.min(n, u);
        double[] data = new double[n];
    	        for (int i = 0; i < c; i++) {
    	            data1[i] = data[i];
    	            data2[i] = data1[i];
    	            data[i] = data2[i];
    	        }
    	    }
    }

