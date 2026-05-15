package Assignment1;

interface Transport {
	void booking();		
}
class Bus implements Transport{
	public void booking(){
		System.out.println("Bus booking");
	}
}
class Flight implements Transport{
	public void booking(){
		System.out.println("Flight booking");
	}
}
public class A18 {
	public static void main(String[] args) {
		Transport Transpor = new Bus();
		Transpor.booking();
		Transport Transpor1 = new Flight();
		Transpor1.booking();
	}

}
