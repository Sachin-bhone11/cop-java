import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		
		int count=0;
		int size;
		Scanner sc=new Scanner(System.in);

		System.out.println("how many element in arraay1");
		size = sc.nextInt();
		int[]myarray1=new int[size];

		System.out.println("how many element in arraay2");
		size = sc.nextInt();
		int[]myarray2=new int[size];
		
	
		int[]myarray3=new int[myarray1.length + myarray2.length];
		
		System.out.println("enter value in array1");
		for(int i=0;i<myarray1.length;i++)
		{
			myarray1[i]=sc.nextInt();
		}
		
		System.out.println("enter value in array2");
		for(int i=0;i<myarray2.length;i++)
		{
			myarray2[i]=sc.nextInt();
		}
		
		for(int i=0;i<myarray1.length;i++)
		{
			myarray3[i]=myarray1[i];
			count++;
		}
		
		for(int j=0;j<myarray2.length;j++)
		{
			myarray3[count++]=myarray2[j];
			
		}
		
		System.out.println("Merge two array");
		for(int i=0;i<myarray3.length;i++)
		{
			System.out.print(" "+myarray3[i]);
		}
		
       sc.close();

	}

}
