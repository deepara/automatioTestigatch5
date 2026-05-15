package Assignment1;

class Bank{
	final String IFSC = "jyguygu";
	final void showIFSC() {
		System.out.println(IFSC);       
	}
}
class HDFCBank extends Bank{
	
//	void showIFSC() {
//		System.out.println(IFSC);     
//}
}


public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hdfc = new HDFCBank();
		hdfc.showIFSC();
	}

}
