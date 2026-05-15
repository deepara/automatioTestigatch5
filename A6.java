package Assignment1;

interface Payment{
	void makePayment();
}
class UPI implements Payment{

	@Override
	public void makePayment() {
		System.out.println("UPI");
		
	}
}
class CreditCard implements Payment{

	@Override
	public void makePayment() {
		System.out.println("Credit Card");		
	}
	
}
public class A6 {

	public static void main(String[] args) {
		UPI UP = new UPI();
		UP.makePayment();
		CreditCard Credit = new CreditCard();
		Credit.	makePayment();
		
	}

}
