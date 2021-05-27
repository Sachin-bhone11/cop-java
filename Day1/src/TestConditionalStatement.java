import java.util.Scanner;

public class TestConditionalStatement {

	public static void main(String[] args) {
		
		int no1,no2,no3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no1");
		no1=sc.nextInt();
		
		System.out.println("Enter no2");
		no2=sc.nextInt();
		
		System.out.println("Enter no3");
		no3=sc.nextInt();
//		
//		if(no1>no2)
//			System.out.println("Max: "+no1);
//		else
//			System.out.println("Max: "+no2);
		
	System.out.println("------------------------------------");	
	
//	if(no1>no2)
//	{
//		System.out.println("Max: "+no1);
//	}else if(no2>no1){
//		System.out.println("Max: "+no2);
//	}else {
//		System.out.println("no1==no2");
//	}
   System.out.println("--------------------------------------");
   
   if(no1>no2)
   {
	   if(no1>no3)
	   {
		  System.out.println("Max:No1 "+no1); 
	   }//inner if
   }//1st if
   else if(no2>no1)
   {
	  if(no2>no3) 
	  {
		   System.out.println("Max:No2 "+no2);
	  }//2nd inner if
   }//2nd if
   
 	   System.out.println("max:No3 "+no3);   
   
    
   sc.close();
		
	}

}
