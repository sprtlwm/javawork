package p06class.p01textbook.exercises.p19;

public class AccountEX {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setBalance(10000);
		System.out.println("현재 잔고:" + ac.getBalance());
		
		ac.setBalance(-100);
		System.out.println("현재 잔고:" + ac.getBalance());
		
		ac.setBalance(2000000);
		System.out.println("현재 잔고:" + ac.getBalance());
		
		ac.setBalance(300000);
		System.out.println("현재 잔고:" + ac.getBalance());
	}
}
