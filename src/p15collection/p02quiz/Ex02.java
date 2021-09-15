package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		boolean run = true;
		
		while(run) {
			System.out.print("종료: 0 , 출력: 1, 삭제: 2, 통계: 3 점수(50이상)>");
			int i = scan.nextInt();
			int sum = 0;
			switch (i) {
			
			case 1:
				
				for(int i2 : list) {
					System.out.println(i2);
				}
				break;
			
			case 0:
			
				run =false;
				break;
			
			case 2:
				if(!list.isEmpty()) {
					list.remove(list.size()-1);
				}
				
				break;
			case 3:
				if(!list.isEmpty()) {
				for(int i2 : list) {
					sum +=i2;
				}
				double i3 = sum/ list.size();
				System.out.println("합:" + sum + "평균:" + i3);
				}
				break;
				
			default:
				if(i>=50) {
					list.add(i);					
				}
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		scan.close();
	}
}
