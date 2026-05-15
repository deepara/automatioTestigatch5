package Assignment1;

class Engine{
	
	void engineInfo(){
		System.out.println("engine");
	}
	
}
class car {
	Engine eng;
	car(Engine eng){
	this.eng=eng;
	}
	void display() {
		System.out.println("car");
		eng.engineInfo();
	}
}


public class A20 {

	public static void main(String[] args) {
		Engine e= new Engine();
car c= new car(e);
c.display();
	}

}
