package Assignment1;

class loanCalculator{
	void calculateLoan(int amount){
		//amount = 765;
		System.out.println("amount is "+amount);
	}
	void calculateLoan(int amount, double intrestRate) {
	//	amount = 765765;
		//intrestRate=13;
		System.out.println("amount is "+amount+" and intrest rate "+intrestRate);
	}
}
public class A15 {

	public static void main(String[] args) {
		loanCalculator loanCalculato=new loanCalculator();
		loanCalculato.calculateLoan(876);
		loanCalculato.calculateLoan(564, 12);
	}

}
