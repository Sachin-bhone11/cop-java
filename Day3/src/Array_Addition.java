import java.util.Scanner;

public class Array_Addition {

	public static void main(String[] args) {
		int row,col;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Row");
		row =sc.nextInt();
		
		System.out.println("Enter the Col");
		col = sc.nextInt();
		
		int [][] arr1 = new int[row][col];
		int [][] arr2 = new int[row][col];
		int [][] arr3 = new int[row][col];
		
		//arr1
		System.out.println("Enter the Element in arr1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		//arr2
		System.out.println("Enter the Element in arr2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		//addition of array
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("addtion of 2d array");
        //display
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print(""+arr3[i][j]);
        	}
        	System.out.println();
        }


		

	}

}
