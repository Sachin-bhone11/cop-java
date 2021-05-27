//1:Create Date class with  data members day,month,year.
//Write a method to accept all data members.write display function to display date.

import java.util.Scanner;

public class DateInfo {
	     private int date;
	     private String month;
	     private int year;
	
	     
//	 accept the data
	     
	   public void acceptData() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Date");
		    date = sc.nextInt();
		    
		    System.out.println("Month");
		    month = sc.next();
		    
		    System.out.println("year");
		    year = sc.nextInt();
		    sc.close();
	   }
	   
	  //display data
	   public void displayData()
	   {
		   System.out.println("Date: "+date);
		   System.out.println("Month: "+month);
		   System.out.println("year: "+year);
	   }

}
