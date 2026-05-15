package Assignment1;

class Product {

	int productId = 4 ;
	String productName = "shoe";
	double price = 4000;
	
	void Product() {
		System.out.println("product created\n");	
	}
	
	void displayProduct() {
		System.out.println("ProductId : " +productId +"\nProduct ame : "+productName +"\nprice : "+price  );
	}
}
public class A3 {
	public static void main(String[] args) {
		Product pro = new Product();
		pro.Product();
		pro.displayProduct();

	}

}
