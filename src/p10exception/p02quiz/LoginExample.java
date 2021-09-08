package p10exception.p02quiz;

public class LoginExample {

	public static void main(String[] args) throws Throwable {
		
		try {
		login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		login("biue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Throwable{
		
		if(!id.equals("biue")) {
		
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			
		
			throw new WorngPasswordException("패스워드가 틀립니다.");
		}
	}
	
}
