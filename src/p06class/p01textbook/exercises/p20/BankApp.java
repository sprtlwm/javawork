package p06class.p01textbook.exercises.p20;

import java.util.Scanner;

public class BankApp {

	private static Account[] arr = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("===================================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===================================================");
			System.out.print("선택 >");
			int select = scan.nextInt();
			
			if(select ==1) {
				creatAccount();
			}else if(select ==2) {
				accountList();
			}else if(select ==3) {
				deposit();
			}else if(select ==4) {
				withdrow();
			}else if(select == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
//계좌생성
	
		private static void creatAccount() {
		System.out.println("===============");
			System.out.println("계좌생성");
		System.out.println("===============");
		
		System.out.print("계좌번호:");
		String ano = scan.next();
		System.out.print("계좌주:");
		String onwer = scan.next();
		System.out.print("초기 입금액:");
		int balance = scan.nextInt();
		
		Account newAcc = new Account(ano, onwer, balance);
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = newAcc;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
		}
	}		
}
	
		private static void accountList() {
			
			System.out.println("===========");
			System.out.println("계좌목록");
			System.out.println("===========");
		
			for(int i = 0; i < arr.length; i++) {
				Account acc = arr[i];
				if(acc != null) {
					System.out.print(acc.getAno());
					System.out.print(" ");
					System.out.print(acc.getOwner());
					System.out.print(" ");
					System.out.print(acc.getBalance());
					System.out.print(" ");
		}
	}
}
		
		private static void deposit() {
		
			System.out.println("=============");
			System.out.println("예금");
			System.out.println("=============");
			
			System.out.print("계좌번호:");
			String ano = scan.next();
			
			System.out.print("예금액:");
			int mon =  scan.nextInt();
			
			Account acc = findAccount(ano);
			if(acc != null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			acc.setBalance(acc.getBalance()+ mon);
			System.out.println("결과: 예금이 완료되었습니다.");
		}
		
		private static void withdrow() {
		
		System.out.println("================");
		System.out.println("출금");
		System.out.println("================");
		
		System.out.println("계좌번호:");
		String ano = scan.next();
		
		System.out.println("출금액:");
		int mon = scan.nextInt();
		
		Account acc = findAccount(ano);
		if(acc ==null) {
			System.out.println("결과: 계좌가 없습니다.");
		}else if(mon > acc.getBalance()) {
			System.out.println("결과:잔액이 부족합니다. ");
		return;
		}
			acc.setBalance(acc.getBalance() - mon);
			System.out.println("출금이 완료되었습니다.");
		}
	
//		Account배열에서 ano와 동일한 Account 객체 찾기
	
		private static Account findAccount(String ano) {
		
			Account acc = null;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] !=null) {
					String dbAno = arr[i].getAno();
					if(dbAno.equals(ano)) {
						acc = arr[i];
						break;
					}
				}
			}
			return acc;
	}
}
