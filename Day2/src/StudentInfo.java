import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, total = 0, percentage,roll_no;
		String name;
		
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Name: ");
        name = sc.next();
        
        System.out.println("Enter a Roll no: ");
        roll_no=sc.nextInt();
        
        System.out.print("Enter no. of subject: ");
        n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100: ");
        for(int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
        
		sc.close();
		
		//calculating avg here
		
	    System.out.println("the Student Grade is ");
	    
	    if(percentage>=80)
        {
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80)
        {
           System.out.print("B");
        } 
        else if(percentage>=40 && percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
		

	}

}
