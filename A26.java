package Assignment1;

class school1{
	String name;
	String address;
	String strength;
	
	school1(String name, String address){
		System.out.println("detail 1\nname : "+name+"\naddress : "+address);
	}
	school1(String name, String address, String strength){
		System.out.println("detail 2\nname : "+name+"\naddress : "+address+"\nstrength : "+strength);
	}
}

public class A26 {
	public static void main(String[] args) {
		school1 a = new school1("Deepa", "abc", "play");
		school1 a1 = new school1("person", "cde");
		
	}

}
