package Assignment1;

class Mall{
	
	Mall(){
		
		System.out.println("Welcome to the mall");
	}
	Mall(String a ){
		this();
		System.out.println("mall name"+a);
	}
}

public class A23 {

	public static void main(String[] args) {
		Mall Mal= new Mall("abc");
	}

}
