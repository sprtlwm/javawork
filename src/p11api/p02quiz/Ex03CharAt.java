package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			
			System.out.print("입력:");
			String str = scan.next();
			int a = str.length();
			
			int b = a/ 2;
			
			System.out.println(str.charAt(b));
			
		}
		scan.close();
	}
}
