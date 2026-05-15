package Assignment1;

class Person{
	Person(){
		System.out.println("Person Created");
	}
}
class studentt extends Person{
	void display(){
		System.out.println("Student Created");
		
	}
	
}
public class A7 {
	public static void main(String[] args) {
		studentt Perso = new studentt();
		Perso.display();
	}
}
