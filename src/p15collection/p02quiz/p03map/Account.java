package p15collection.p02quiz.p03map;

public class Account {
	
//	private String ano;
	private String owner;
	private int balance;
	
	public Account (String owner, int balance) {
//		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}


//	public void setAno(String ano) {this.ano = ano;}
//	public String getAno() {return ano;}

	public void setOwner(String owner) {this.owner = owner;}
	public String getOwner() {return owner;}
	
	public void setBalance(int balance) {this.balance = balance;}
	public int getBalance() {return balance;}
	
		
//	public String toString() {
//		return ano + "   " + owner + "   " + balance;
//	}
	
}
