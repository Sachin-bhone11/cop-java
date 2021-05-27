import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size");
		size = sc.nextInt();
		int [] arr = new int [size];
		
		//read array
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		display
		System.out.println("Display before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("sorting array");
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}


	}

}
