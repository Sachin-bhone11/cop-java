import java.util.Scanner;

public class TestArithmaticoperator {

	public static void main(String[] args) {
		int no1,no2;
		int result;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter No1");
		no1=sc.nextInt();
		
		System.out.println("Enter no2");
		no2=sc.nextInt();
		
		result = no1+no2;
		System.out.println("Addition:"+result);
		
		result = no1-no2;
		System.out.println("subs:"+result);
		
		result = no1*no2;
		System.out.println("Multi:"+result);
		
		result = no1/no2;
		
		if(no2>0)
		{
		result = no1 / no2;
		System.out.println("Div=" + result);
		}
		else
		{
			System.out.println("Can't Divide By 0");
		}
		sc.close();
	}
}
