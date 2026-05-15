package Assignment1;

class Calculator {

	void add(int a, int c) {
		
		System.out.println("The values are "+ a+ " "+c);
	}
	void add(double a, double c) {
		System.out.println("The values are "+ a+ " "+c);
	}
}
public class A4 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(6, 8);
		cal.add(9, 56);

	}

}
