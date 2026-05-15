package Assignment1;

class university{
	static String universityName= "abc";
	static String country = "India";
	
	void display(){
		 System.out.println("universityName : "+universityName+"country : "+country);
		 
	}
	
}
public class A21 {

	public static void main(String[] args) {
		university universit= new university();
		universit.display();
		university.country="china";
		university.universityName = "IIT";
		universit.display();
	}

}
