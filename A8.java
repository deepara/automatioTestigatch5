package Assignment1;

class   Shape {
void  area( ) {  
	   System.out.println("shape parent class");                                        	
}
}
class   rectangle extends Shape {
void  area( ) {  
	      System.out.println("rectangle");                                     	
}
}
class   circle extends Shape {
void  area( ) {  
	System.out.println("circle");                                            	
}
}
public class A8 {
	public static void main(String[] args) {
		Shape Shape = new circle();
		Shape.area();
		Shape Shape1 = new rectangle();
		Shape1.area();
	}

}
