package p14lambda.p03lecture;

import java.util.Arrays;
import java.util.List;

public class Ex14FinalVariable {
	public static void main(String[] args) {
		final int a = 3;
		
		int sum = 0;
		List<Integer> list = Arrays.asList(3,4,5);
//		list.forEach(e -> sum +=e);
								// 사용하는 지역변수는 final
								// final이 아니면 final로 간주함
		list.forEach(e -> System.out.println(sum));
		
//		sum = 1;
		
		
	}
}
