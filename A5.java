package Assignment1;

abstract class Animal {
	abstract void sound();
	
	class Dog extends Animal{

		void sound() {	
			System.out.println("dog souds");
		}
		
	}
	class Cat extends Animal{

		void sound() {
			System.out.println("cat souds");
		}
		 
	}
}
public class A5 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
				Animal cat = new Cat();
				cat.sound();
	}

}
