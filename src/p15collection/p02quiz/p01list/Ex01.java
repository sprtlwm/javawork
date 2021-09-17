package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		boolean run = true;
		
		while(run) {
			System.out.print("l : list, r : remove, e : exit 입력>");
			String str = scan.nextLine();
			
//			 list.add(scan.nextLine());
//			String exit = scan.next();
//			if(exit.equals('e')) {
//				break;
//			}
			switch (str) {
			case "l":
				for(String s : list) {
					System.out.println(s);
				}
				break;
			case "r":
//				list.remove(list.size()-1);
				if(!list.isEmpty()) {
					list.remove(list.size()-1);
				}
				break;
			case "e":
				run = false;
				break;
			default:
				list.add(str);
				break;
			}
			 
		}
		
		scan.close();
	}
}
