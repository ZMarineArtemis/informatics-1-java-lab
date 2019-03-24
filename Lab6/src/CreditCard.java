import java.util.Calendar;
public class CreditCard {
  private int expiryMonth;
  private int expiryYear;
  private String firstName;
  private String lastName;
  private String ccNumber;
  public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String string) {
	  this.expiryMonth = expiryMonth;
	  this.expiryYear = expiryYear;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.ccNumber = string;
  }
  public String formatExpiryDate() {
	  String final_2_digital_expiryYear = Integer.toString(expiryYear).substring(2); 
	  return String.format("%s/%s", expiryMonth, final_2_digital_expiryYear);
  }
  public String formatFullName() {
	  return String.format("%s %s", firstName, lastName);
  }
  public String formatccNumber() {
	  String[] nums = new String[4];
      for (int i = 0; i < nums.length; i++) {
          int idx = i * 4;
          nums[i] = ccNumber.substring(idx, idx + 4);
      }
      String s = String.format("%s %s %s %s", (Object[]) nums);
      return s;
  }
  public boolean isValid() {
	  Calendar now = Calendar.getInstance();
	  int nowMonth = now.get(Calendar.MONTH)+1;
	  int nowYear = now.get(Calendar.YEAR);
	  return (expiryYear > nowYear || (expiryYear == nowYear && expiryMonth > nowMonth));
  }
  public String toString() {
	  return String.format("Number: %s \n Expiration data: %s \n Account holder: %s \n Is valid: %s", formatccNumber(), formatExpiryDate(), formatFullName(), isValid());
  }
  public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      System.out.println("Current Year is: " + now.get(Calendar.YEAR));
      System.out.println("Current Month is: " + (now.get(Calendar.MONTH) + 1));
      System.out.println();

      CreditCard cc1 = new CreditCard(2, 2013, "Bill", "Gates", "1234567891234567");
      System.out.println(cc1);
      System.out.println();
      CreditCard cc2 = new CreditCard(3, 2019, "Melinda", "Gates", "1111222233334444");
      System.out.println(cc2);
  }
}
