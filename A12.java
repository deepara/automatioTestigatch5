package Assignment1;

class Account{
	private String accountHolderName;
	private int balance;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<0) {
			System.out.println("warning not add below 0");
		}else 
		this.balance = balance;
	}
	
}
public class A12 {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(-87);
		System.out.println(account.getBalance());
		
	}

}
