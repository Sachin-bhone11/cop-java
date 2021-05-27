import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int c=0,a;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp == c)
		{
			System.out.println("armstrong number");
		}else
		{
			System.out.println("not amstrong number");
		}
     sc.close();
	}

}
