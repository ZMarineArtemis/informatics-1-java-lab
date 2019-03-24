
public class NbyN {
	public static int[] [] nbyn(int N){
		int[][] n = new int[N][N]; 
		for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {		
			if(i == j) {
			n[i][j] = i;
			}else {
				n[i][j] = 0;
			}			
			}
		}
		return n;
	  }
	  public static void main(String[] args) {

		  int[][] m1 = nbyn(10);
	        for (int i = 0; i < m1.length; i++) {
	            for (int j = 0; j < m1[i].length; j++) {
	                System.out.print(m1[i][j] + " ");
	  }
	            System.out.println();
    }
  }
}

