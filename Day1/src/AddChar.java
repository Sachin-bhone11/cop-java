import java.util.Scanner;

public class AddChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c,d;
       
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		c=sc.next().charAt(0);
		System.out.println("Enter a  character");
		d=sc.next().charAt(0);
		
		int r = c + d;
		System.out.println(r);
	}

}
