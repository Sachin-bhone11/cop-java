import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float basic_salary,da,hra,da1,hra1,GrossPayment;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The basic Salary");
		basic_salary = sc.nextFloat();
		
		System.out.println("Enter DA: ");
		da1 = sc.nextFloat();
		
		System.out.println("Enter HRA: ");
		hra1 = sc.nextFloat();
		
		 da = (da1 * basic_salary) / 100;
		  hra = (hra1 * basic_salary) / 100;

		  GrossPayment = basic_salary + da + hra;

		  System.out.println("Gross Salary Of Employee: "+GrossPayment);

	}

}
