package p11api.p02quiz;

import java.util.Scanner;

public class Ex06Replace {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력:");
		String str = scan.nextLine();
		
		System.out.println(str.replace(" ",""));
		
		
		
		scan.close();
	}
}
