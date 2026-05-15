package Assignment1;

class camera{
	void capture(){
		System.out.println("camera");
	}
}
class DSCCamera extends camera{
	void capture(){
	super.capture();;
	System.out.println("DSC Camera");
	}
}
public class A19 {
	public static void main(String[] args) {
		DSCCamera DSC = new DSCCamera();
		DSC.capture();
	}

}
