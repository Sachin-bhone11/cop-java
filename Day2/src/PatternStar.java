
public class PatternStar {

	public static void Pattern(int n) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		//outer loop for rows
		for(i=0; i<n; i++) {
			
			//inner  loop for handle number of column
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		   int n=5;
		   Pattern(n);
	}

}
