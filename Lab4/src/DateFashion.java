
public class DateFashion {
 public static int dateFashion(int you, int date) {
	 for(int i = 0; i < 10; i++) {
		 if(you >= 8 || date >= 8) {
			 return 2;
		 }else {
			 if(you <= 2 || date <= 2) {
				 return 0;
			 }
		 }
			 
	 }
	 return 1;
 }
 public static void main(String[] args) {
	 int you = Integer.parseInt(args[0]);
	 int date = Integer.parseInt(args[1]);
	 System.out.println(dateFashion(you, date));
 }
}
