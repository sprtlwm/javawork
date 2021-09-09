package p11api.p02quiz;

import java.util.Scanner;

public class Ex04Substring {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력:");
			String str = scan.next();
			
			if(str.equals("end")) {
				break;
			}
			int l = str.length();
			
			int c = l / 2; 
			
			System.out.println("앞절반:" + str.substring(0, c));
			System.out.println("뒤절반:" + str.substring(c));
	
		}
		scan.close();
	
}
}
