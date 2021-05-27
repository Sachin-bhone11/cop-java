import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int p = 20000;
		 int r = 6;
		 int n = 3;
		 
		 System.out.println("Principle " + p);
		 System.out.println("Rate " + p);
		 System.out.println("Time " + p);
		 int si = 1 +(r/n);
		 System.out.println("Compound Interest "+ p*Math.pow(si, n));
		 
	}

}
