//3:Consider that payroll software needs to be developed for computerization of
//operations of an ABC organization. The organization has employees.
//
//3.1. Construct a class Employee with following members using private access
//specifies:
// Employee Id integer
// Employee Name string
// Basic Salary double
// HRA double
// Medical double
// PF double
//PT double
// Net Salary double
// Gross Salary double
//Please use following expressions for calculations:
// * HRA = 50% of Basic Salary
//* PF = 12% of Basic Salary
//* PT = Rs. 200
//
//3.2. Write methods to display the details of an employee and calculate the gross
//and net salary.
//* Goss Salary = Basic Salary + HRA + Medical
//* Net Salary = Gross Salary – (PT + PF)

import java.util.Scanner;
public class EmployeeInfo {

	private int e_id;
	private String name;
	private double basic_salary;
	private  double hra;
	private double medical;
	private double pf;
	private double pt;
	private double net_salary;
	private double gross_salary;
	
//	accept employee data
	
	public void acceptEmpData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Emp-Id");
		e_id = sc.nextInt();
		
		System.out.println("Enter Name");
		name = sc.next();
		
		System.out.println("Enter Basic_Salary");
		basic_salary = sc.nextDouble();
		

		
		sc.close();
	}
	
	public void displayEmpData()
	{
		hra = 0.5 * basic_salary;
		pf = 0.12 * basic_salary;
		gross_salary = basic_salary + hra + medical;
		 net_salary = gross_salary - (pt + pf);
		 
		 System.out.println("Emp Id "+e_id);
		 System.out.println("Name of the Employee: "+name);
		 System.out.println("Gross Salary of the Employee: "+gross_salary);
		 System.out.println("Net Salary: "+net_salary);
		 	
	}
	
	
}
