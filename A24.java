package Assignment1;

class  shapes{
	int length = 5;
	
	void square(){
		int area = length*length;
		System.out.println("square area ="+area);
		
	}
	void rectangle(){
		int width = 4;
		int area = length *width;
		System.out.println("rectangle area ="+area);
	}
	void circle(){
		double pi = 3.14;
		double area = pi*length*length;
		System.out.println("circle area ="+area);
	}
}

public class A24 {

	public static void main(String[] args) {
		shapes sh = new shapes();
		sh.square();
		sh.rectangle();
		sh.circle();
	}

}
