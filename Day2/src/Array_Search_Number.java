import java.util.Scanner;

public class Array_Search_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num ,i, flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many number");
		int[] myarray = new int[(sc.nextInt())];
		
		System.out.println("Enter the value");
		for(i=0;i<myarray.length;i++) {
			myarray[i]=sc.nextInt();
		}
		
		System.out.println("Display value");
		for(i=0;i<myarray.length;i++) {
			System.out.println(myarray[i]);
		}
		
		System.out.println("Enter the number you want to search");
		num = sc.nextInt();
		
		for(i=0;i<myarray.length;i++) {
			
			if(myarray[i]==num)
			{
				flag=1;
				break;
			}else
			{
				flag=0;
			}//else
		}//for
    	
		if(flag==1)
		{
			System.out.println(num+" num are found in array at "+i+"index");
		}else
		{
			System.out.println(num+" num are not found in array");
		}

	}

}
