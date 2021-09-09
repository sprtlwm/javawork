package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	public static void main(String[] args) {
		//scanner
		//loop
		//입력받은 문자열이 몇 글자인지 출력하는 코드
		
		Scanner scan = new Scanner(System.in);
	while(true) {	
		System.out.print("입력:");
		String w = scan.next();
		System.out.println(w.length() + "글자입니다.");
		}
	}
}
