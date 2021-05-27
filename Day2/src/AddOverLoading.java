import java.util.Scanner;

public class AddOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1,no2;
		double no3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1 no2 no3 ");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3=sc.nextDouble();
		
		add(no1,no2);
		add(no1,no3);
		add(no1,no2,no3);
	}
	
	public static void add(int a, int b)
	{
		int result;
		result=a+b;
		System.out.println("Addition is= "+result);
		
	}
	
	public static void add(int a,double b)
	{
		double result;
		result=a+b;
		System.out.println("addition is= "+result);
	}
	
	public static void add(int a, int b, double c)
	{
		double result;
		result=a+b+c;
		System.out.println("Addition is= "+result);
	}
}
