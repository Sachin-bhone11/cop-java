import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=5;
     boolean flag= true;
     
     for ( int i = 2;i<=num; i++)
     {
    	//condition for non prime
    	 if(num % i==0)
    	 {
    		flag = true;
    		break;
    	 }//if
		
	}//for
     
     if(!flag)
    	 System.out.println(num +" is a prie number");
     else
    	 System.out.println(num +" is not a prime number ");
}
}
