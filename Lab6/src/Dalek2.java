public class Dalek2 {
	private String[] utterance = {};
	public void setSayings(String[] utterance) {
		  this.utterance = utterance;
	  }
  public void speak() {
	  int N = utterance.length;
	  if(N > 0) {
	  int c = (int)(Math.random() * N);
	  System.out.println(utterance[c]);
	  }else {
		  System.out.println("No utterances installed");
	  }
	  
  }
	public static void main(String[] args) {

	    Dalek2 d1 = new Dalek2();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}

}
