import java.util.Scanner;

public class powerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base,exp;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A base number:");
		
		base = sc.nextInt();
		int result=base;
		
		System.out.println("Enter a exponent:");
		exp = sc.nextInt();
		
		for(int i=0; i<exp; i++)
		{
			result = base * base;
		}
		System.out.println("Result of "+ base+" power "+exp+" is "+result);
		

	}

}
