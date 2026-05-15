package Assignment1;

class Device{
	void start() {
		 System.out.println("start");
	}
}
class Mobile extends Device{
	void calling() {
		System.out.println("calling");
	}
}
class SmartPhone extends Mobile{
	void internet() {
		System.out.println("smart phone");
	}
}
public class A13 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.internet();
		phone.calling();
		phone.start();
	}

}
