import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a First Number");
		n1=sc.nextInt();
		
		System.out.println("Enter a Second Number");
		n2=sc.nextInt();
		
		System.out.println("Enter a third Number");
		n3=sc.nextInt();
		
		if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else 
        	if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
		
	}

}
