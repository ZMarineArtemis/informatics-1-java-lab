
public class Vector3D {
    double x;
    double y;
    double z;
public Vector3D(double x, double y, double z) {
	this.x = x;
	this.y = y;
	this.z = z;
}
public double getR() {
	double r = Math.sqrt(x*x + y*y + z*z);
	return r;
}
public double getTheta() {
	double theta = Math.acos(z/getR());
	return theta;
}
public double getPhi() {
	double phi = Math.atan(y/x);
	return phi;
}
public static Vector3D add(Vector3D lhs, Vector3D rhs) {
	return new Vector3D(lhs.x + rhs.x, lhs.y + rhs.y, lhs.z + rhs.z);
}
public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
    return new Vector3D(lhs.x - rhs.x, lhs.y - rhs.y, lhs.z - rhs.z);
}

public static Vector3D scale(Vector3D lhs, double scaleFactor) {
    return new Vector3D(lhs.x * scaleFactor, lhs.y * scaleFactor, lhs.z * scaleFactor);
}
}
