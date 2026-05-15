package Assignment1;

abstract class Employee{
	abstract void calculateSalary();
	 void employeeDetails() {
		 System.out.println("employee detail");
	 }
}
class FullTimeEmployee extends Employee{

	@Override
	void calculateSalary() {
System.out.println("full time employee salary");		
	}	
	
}
class partTimeEmployee extends Employee{

	@Override
	void calculateSalary() {
		System.out.println("part time employee name");			
		
	}
	
}
public class A17 {

	public static void main(String[] args) {
		FullTimeEmployee employee=new FullTimeEmployee();
employee.calculateSalary();
employee.employeeDetails();
partTimeEmployee employee1=new partTimeEmployee();
employee1.calculateSalary();
employee1.employeeDetails();
	}

}
