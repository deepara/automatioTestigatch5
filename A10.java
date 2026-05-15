package Assignment1;

class student{
	static String collageName="yuj";
	String name;
	int rollNo;
	student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		
	}
	void display() {
		System.out.println(collageName);
		System.out.println(name);
		
		System.out.println(rollNo);
	}
}
public class A10 {

	public static void main(String[] args) {
		student s1= new student("deepa",7);
		s1.display();
		student s2= new student("hfh",79);
		s2.display();
				
	}

}
