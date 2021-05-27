import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a n1");
		   n1=sc.nextInt();
		   
		   System.out.println("Enter a n2: ");
		   n2=sc.nextInt();
		   
		   result = n1 + n2;
		   
		   System.out.println("Addition: "+result);
		
		
	}

}
