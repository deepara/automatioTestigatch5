package Assignment1;

class Hospital{
	void emergencyService() {
		System.out.println("parent");
	}
}
class CityHospital extends Hospital{
	void emergency() {
	super.emergencyService();
	System.out.println("subclass");
	}
}
public class A16 {

	public static void main(String[] args) {
		CityHospital CityHospita=new CityHospital();
		CityHospita.emergency();
	}

}
