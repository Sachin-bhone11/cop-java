import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a n1 and n2");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		System.out.println("before swapping " + n1 + " " + n2);
		
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("After Swapping "+ n1 +" "+ n2);
		
		
		
	}

}
