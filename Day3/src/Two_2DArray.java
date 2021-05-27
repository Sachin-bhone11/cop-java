import java.util.Scanner;

public class Two_2DArray {

	public static void main(String[] args) {
		int row,col;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row");
		row =sc.nextInt();
		
		System.out.println("enter the column");
		col = sc.nextInt();
		
		int [][] arr= new int[row][col];
		
		System.out.println("enter the value in array");
		for(int i=0;i<row;i++) 
		{
		   for(int j=0;j<col;j++)
		   {
			   arr[i][j]=sc.nextInt();
		   }//inner for
		}//outer for
		
		System.out.println("Display value in array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+arr[i][j]);
			}//inner
			System.out.println();
		}//outer
		
   sc.close();
	}

}
