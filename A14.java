package Assignment1;
class course{
	void courseInfo() {
		System.out.println("course information");
	}
}
class science extends course{
	void science() {
		System.out.println("science");
	}
}
class Commerce extends course{
	void commerce() {
		System.out.println("commerce");
	}
}
class arts extends course{
	void Arts() {
		System.out.println("arts");
	}
}
public class A14 {

	public static void main(String[] args) {
		arts art=new arts();
		art.Arts();
		Commerce Commerce=new Commerce();
		Commerce.commerce();
		science scienc = new science();
		scienc.science();
	}

}
