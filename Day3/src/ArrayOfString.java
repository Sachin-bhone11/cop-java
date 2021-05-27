import java.util.Scanner;

public class ArrayOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] myarray;
		//size 
		System.out.println("How many  String You want");
		int size = sc.nextInt();
		myarray = new String[size];
		
		//read array
		System.out.println("Enter the String");
		for(int i=0;i<myarray.length;i++)
		{
			myarray[i]=sc.next();
		}
		
		//display array
		System.out.println("display string");
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
			
		}
		
		//convert in uppercase
		stringUpper(myarray);
		sc.close();
	}
	
		public static void stringUpper(String[] myarray)
		{
			
			System.out.println("strings are display in  upper case=");
			for(int i=0;i<myarray.length;i++)
			{
				System.out.println(myarray[i].toUpperCase());
			}

			}

}
