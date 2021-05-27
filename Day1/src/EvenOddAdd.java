import java.util.Scanner;

public class EvenOddAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number , evenSum=0, oddSum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number");
		number = sc.nextInt();
		
		for ( int i;i <=number;i++)
		{
			if(i % 2==0)
			{
				evenSum = evenSum+1;
			}else
			{
				oddSum = oddSum+1;
			}
		}
		
		System.out.println("the Sum of Even number "+ evenSum);
		System.out.println("the Sum of Odd number "+ oddSum);
		

	}

}
