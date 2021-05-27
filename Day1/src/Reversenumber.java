import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num,reverse=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		while(num != 0)
		{
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num /10;
		}
		System.out.println("the Reverese of the given number is "+ reverse);
	}

}
