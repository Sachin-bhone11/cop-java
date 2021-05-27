import java.util.Scanner;

public class EmpDetail {

	private String name;
	private int id;
	private String address;
	private String department;
	private String email;
	private double Mobile_no;
	
	//accept detail
	
	public void EmpAccept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		 name = sc.nextLine();
		
		 System.out.println("Enter Id");
		 id = sc.nextInt();
		 
		 System.out.println("Enter a address");
		 address = sc.next();
		 
		 System.out.println("Enter Department");
		 department = sc.next();
		 
		 System.out.println("Enter Email");
		 email = sc.next();
		 
		 System.out.println("Enter Mobile number");
		 Mobile_no = sc.nextDouble();
		 sc.close();
		 	
	}
	
	public void Empdisplay()
	{
		System.out.println("Name; "+name);
		System.out.println("ID: "+id);
		System.out.println("Address: "+address);
		System.out.println("Department: "+department);
		System.out.println("Email: "+email);
		System.out.println("Mobile No: "+Mobile_no);
	}	
	
}
