import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		n = sc.nextInt();
		
		System.out.println("Prime Number Between 1 to "+n+" are");
		
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");     
		}
		

	}

}
