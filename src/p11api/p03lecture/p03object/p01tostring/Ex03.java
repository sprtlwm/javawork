package p11api.p03lecture.p03object.p01tostring;

public class Ex03 {
	public static void main(String[] args) {
		
	Account a1 = new Account("333-333", "son", 30000);
		
		System.out.println(a1.toString());
		System.out.println(a1);
		System.out.println(String.valueOf(a1));
	}
}
