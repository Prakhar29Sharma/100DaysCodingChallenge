import java.util.Scanner;

public class Net_Salary {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int empno, PT, CCA;
		String empname;
		double basic, DA, HRA, PF, gross_salary, net_salary;
		
		System.out.print("Enter Employee Number : ");
		empno = input.nextInt();
		System.out.print("Enter Employee Name : ");
		empname = input.next();
		System.out.print("Enter Employee Base Salary : ");
		basic = input.nextDouble();
		
		DA = 0.7*basic;
		HRA = 0.3*basic;
		CCA = 240;
		PF = 0.1*basic;
		PT = 100;
		
		gross_salary = DA + HRA + CCA;
		net_salary = gross_salary - PF - PT;
		
		System.out.println("Gross Salary of Employee : " + gross_salary);
		System.out.println("Net Salary of Employee : " + net_salary);
		
		return;
	}
}

