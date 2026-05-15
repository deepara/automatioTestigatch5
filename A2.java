package Assignment1;

class vehicle{
	public void fuelType() {
		System.out.println("rus on fuel");
	}
}
class ElectricCar extends vehicle{
		public void fuelType() {
			System.out.println("rus on electricity");
		}
		void display(){
			super.fuelType();
			fuelType();
		}
}


public class A2 {
	public static void main(String[] args) {
		ElectricCar Electric = new ElectricCar();
		Electric.display();
		
	}

}
