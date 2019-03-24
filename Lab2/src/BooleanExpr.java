
public class BooleanExpr {
     public static void main(String[] args) {
		Boolean a = Boolean.parseBoolean(args [0]);
		Boolean b = Boolean.parseBoolean(args [1]);
		Boolean phi = (!(a && b) && (a || b)) || ((a && b) || !(a || b)); 
        System.out.println("a" + ":" + a);
        System.out.println("b" + ":" + b);
        System.out.println("phi" + ":" + phi);
     }

}
