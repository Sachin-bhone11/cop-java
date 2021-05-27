import java.util.Scanner;

public class Menu_Driven_Stationary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int choice;
     
     Scanner sc = new Scanner(System.in);
     
     while(true) 
     {
    	  System.out.println("------------------Menu-----------------------");
    	     System.out.println("1.Pen");
    	     System.out.println("2.pencil");
    	     System.out.println("3.notebook");
    	     System.out.println("4.Bottel");
    	     System.out.println("5.Colorbox");
    	     System.out.println("0.Exit");
    	     
   
    	 System.out.println("Enter Your Choice");
    	 choice = sc.nextInt();
    	 
    	 switch (choice) 
    	 {
    	 case 1:
     		System.out.println("1 pen cost is 10rs. ");
     		System.out.println("How mny pens you want to buy");
     		
     		int x;
     		int a;
     		x=sc.nextInt();
     		a=x*10;
     		System.out.println("Total Price After Buying "+x+"pens ="+a);
     		break;
     		
     	 case 2:
     		 System.out.println("1 pencil cost price is 5rs ");
     		 System.out.println("How many pencil you want to buy");
     		 
     		 int c;
     		 int d;
     		 c=sc.nextInt();
     		 d=c*10;
     		 System.out.println("total price after buying "+c+"pencil= "+d);
     		 break;
     		 
     	 case 3:
     		 System.out.println("1 notebook cost price is 20");
     		 System.out.println("How many pencil you want to buy");
     		 
     		 int note;
     		 int e;
     		 note=sc.nextInt();
     		 e = note * 20;
     		 System.out.println("total price after buying "+note+"pencil= "+e);
     		 break;
     		 
     	 case 4:
     		 System.out.println("1 Bottel cost price is 30rs");
     		 System.out.println("How many Bootel you want to buy");
     		 
     		 int bo;
     		 int f;
     		 bo=sc.nextInt();
     		f = bo * 20;
     		 System.out.println("total price after buying "+ bo+ "pencil= "+f);
     		 break;	 
     		 
     	 case 5:
     		 System.out.println("1ColorBox cost price is 15rs");
     		 System.out.println("How many colorbox you want to buy");
     		 
     		 int color;
     		 int g;
     		 color=sc.nextInt();
     	  	 g = color* 5;
     		 System.out.println("total price after buying "+color+"pencil= "+ g);
     		 break;
     		 
     	 case 0: return;
     		 default: 
     			 System.out.println("invalid choice");
     			 break;
    	 }//switch
    	 
     }//while
     		
	}

}//end
