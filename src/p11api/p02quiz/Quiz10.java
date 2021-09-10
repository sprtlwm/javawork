package p11api.p02quiz;

import java.util.regex.Pattern;

public class Quiz10 {

	public static void main(String[] args) {
		
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{7,11}";
		boolean is = Pattern.matches(regExp, id);
		
		if(is) {
			System.out.println("id를 사용할 수 있습니다.");
		}else {
			System.out.println("id를 사용할 수 없습니다.");
		}
	}
}
