import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		
		long fact = 1;
		
	 for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
		System.out.println("Factorial of number "+number+ " is "+ fact);
		
		
	}

}
