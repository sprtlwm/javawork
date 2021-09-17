package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
//		Math.random();
//		1~45 사이의 값 6개 램덤
		
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size()<6) {	
		for(int i = 0; i < 6; i++) {
			int l  = (int)(Math.random()*45)+1;
				System.out.println(l);			
			
			if(lotto.contains(l)) {
				lotto.add(l);
				break;
			}

		}		
		System.out.println("===========");
		for(int l :lotto) {
			System.out.println(l);
		}
	}
}
}