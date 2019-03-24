package DNA;
public class DNAStrand {
	private String dna;
	public DNAStrand(String dna) {
	 this.dna = dna;
	}
	public Boolean isValidDNA() {
        if (dna == null || dna == "")
            return false;
        String dnaWithoutTCGA = dna.replace("T", "").replace("C", "").replace("A", "").replace("G", "");
        return dnaWithoutTCGA.length() == 0;
    }
	
    public String complementWC() {
        String swapAT = dna.replace("T", "t").replace("A", "T").replace("t", "A");
        String swapATCG = swapAT.replace("G", "g").replace("C", "G").replace("g", "C");
        return swapATCG;
    }
    public String palindromeWC() {
    	String tmp = complementWC();
    	String palindrome = " ";
    	for(int i = tmp.length()-1; i >= 0; i--) {
    		palindrome += tmp.charAt(i); 
    	}
    	return palindrome;
    }
    public boolean containsSquence(String seq) {
    	int n = dna.length();
    	int c = seq.length();
    	for(int i = 0; i <= n; i++) {
    		if(dna.charAt(i) == seq.charAt(i)) {
    			for(int j = i; j <= c; j++) {
    				if(dna.charAt(j) == seq.charAt(j)) {
    				}else {
    					return false;
    				}
    			}	
    		}else {
    			return false;
    		}
    	}
    	return true;
    }
    public String toString() {
        return dna;
    }
}