package p06class.p01textbook.exercises.p19;

public class Account {

	private int balance;
	
	private final static int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance >= 0 && balance<=1000000) {
			this.balance = balance;
		}
	}
			

	
	
	
}
