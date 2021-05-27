import java.util.Scanner;

public class SwapFunction {

	
	public static void Swap() {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First Number");
		a = sc.nextInt();
		
		System.out.println("Enter a Secod number");
		b = sc.nextInt();
		
        System.out.println("Before Swapping"+a+" "+b);
        
        c=a;
        a=b;
        b=c;
        
        System.out.println("After Swapping"+a+" "+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap();
	}

}
