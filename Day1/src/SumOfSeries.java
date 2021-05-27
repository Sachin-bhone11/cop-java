import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a=0,num;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no to find sum");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			a=a+i;
		}
System.out.println("sum of series of n number is : "+ " "+a);
		
		
	}

}
