package p10exception.p02quiz;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("첫번쩨 수 입력:");
			String	str1 = scan.next();
			
			System.out.print("두번쨰 수 입력:");
			String str2 = scan.next();
		try {	
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
		
			System.out.println("더한 결과 :" + (n1 +n2));
		}catch(NumberFormatException e){
			System.out.println("잘못된 접근입니다.");
		}
	}
			scan.close();
		}
	}

