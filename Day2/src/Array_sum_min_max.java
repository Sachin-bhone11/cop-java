import java.util.Scanner;

public class Array_sum_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double avg,sum=0;
		 int i,max,min;
		
		 int choice;
		 
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
			sc.close();	 
		 while(true)
		 {
			 System.out.println("1.Maximum ");
			 System.out.println("2.Minimun ");
			 System.out.println("3.Sum ");
			 System.out.println("4 Average ");
			 
			 System.out.println("Enter Your Choice");
	    	 choice = sc.nextInt();
	    	 
	    	 
	    	 
	    	 switch(choice)
	    	 {
	    	 case 1:
	    		max=myarray[0];
	    		for(i=0;i<myarray.length;i++)
	    		{
	    			if(max<myarray[i])
	    			{
	    				max=myarray[i];
	    			}
	    		}
	    		System.out.println("max num in array is= "+max);
	    		break;
	    		 
	    	 case 2:
		    		min=myarray[0];
		    		for(i=0;i<myarray.length;i++)
		    		{
		    			if(min>myarray[i])
		    			{
		    				min=myarray[i];
		    			}
		    		}
		    		System.out.println("min num in array is= "+min);
		    		break;
		    		
	    	 case 3:
	    		 for(i=0;i<myarray.length;i++)
	    		 {
	    			 sum=sum+myarray[i];
	    		 }
	    		 
	    		 System.out.println("Sum of Array is "+sum);
	    		 break;
	    		 
	    	 case 4:
	    		 avg = sum/myarray.length;
	    		 System.out.println("Average = "+avg);
		    	 
	    	 default:
	    		 System.out.println("Invalid Choice");
	    		 break;
	    	 
	    	 }//switch
			 
		 }//while
		

	}

}
