package Assignment1;

class Library{
	String libraryName="hiuh";
	Library(){
		System.out.println("welcome to library");
	}
	void showLocation() {
		System.out.println("this place located in mubai");
	}
	
}
public class A11 {

	public static void main(String[] args) {
		Library l=new Library();
		l.showLocation();
	}

}
