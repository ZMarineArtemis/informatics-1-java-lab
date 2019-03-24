
public class OneTimePadEncipher {
    public static int charToInt(char l) {
        char x = Character.toLowerCase(l);
        int result = (int)(x) - (int)('a');
        return result;
      }

      public static char intToChar(int i) {
    	  int c = -1;
    	  if(i < 26) {
          c = i + (int)('a');
    	  }
    	  if(i > 26){
    		  c = (i%26) + (int)('a');
    		 }return(char)(c);
      }

	public static boolean isAlpha(char c) {
        int t = charToInt(c);
        if (t >= 0 && t < 26) {
            return true;
        }
        return false;

    }
     

      public static String encipher(String plaintext, String onetimepad) {
    	  if (plaintext.length() > onetimepad.length()) {
              System.out.print("The length of the OTP is too short");
              return "";
          }

          String lcPlaintext = plaintext.toLowerCase();
          String lcOnetimepad = onetimepad.toLowerCase();

          String newStr = "";
          for (int i = 0; i < lcPlaintext.length(); i++) {
              char o = lcPlaintext.charAt(i);
              char k = lcOnetimepad.charAt(i);

              if (isAlpha(o)) {
                  newStr += intToChar(charToInt(o) + charToInt(k));
              }
              else {
                  newStr += o;
              }
          }
          return newStr;
      }




      public static void main(String[] args) {
        String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
        System.out.print(ciphertext);
      }

  }