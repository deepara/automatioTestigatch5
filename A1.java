package Assignment1;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayDetails() {
		int id  = getEmpId();
		String Name = getEmpName();
		double salary = getSalary();
		
		System.out.println("Employee details : \nEmployee ID : "+empId +"\nName : "+ empName +"\nSalary "+salary);
	}

}

public class A1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(2);
		emp.setEmpName("Deepa");
		emp.setSalary(745635);
		emp.displayDetails();


	}

}
