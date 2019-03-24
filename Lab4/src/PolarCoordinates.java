
public class PolarCoordinates {
	 public static double convertXYtoR(double x, double y) {
	        // ADD CODE HERE
		 return Math.sqrt(x * x + y * y);
	    }

	    public static double convertXYtoT(double x, double y) {
	        // ADD CODE HERE
	    	return Math.atan2(y, x);
	    }

	    public static double convertRTtoX(double r, double theta) {
	        // ADD CODE HERE
	    	return r * Math.cos(theta);
	    }

	    public static double convertRTtoY(double r, double theta) {
	        // ADD CODE HERE
	    	return r * Math.asin(theta);
	    }

	    public static double convertDegToRad(double deg) {
	        // ADD CODE HERE
	    	return (deg/180) * Math.PI;
	    }

	    public static double convertRadToDeg(double rad) {
	        // ADD CODE HERE
	    	return (rad/Math.PI) * 180;
	    }
	}


