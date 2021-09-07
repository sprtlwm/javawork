package p08interface.p03lecture.p05casting;

import java.io.Serializable;

public class Example2 {

	public static void main(String[] args) {
	
		String str = "java";
		method(str);		
		
		int[] arr = {1, 2};
		method(arr);
		
		System.out.println("프로그램 정상종료");
		
	}
	//하위타입으로 강제 형변환
	public static void method(Object o) {
		String s = (String) o;
		Serializable se = (Serializable) o;
		Comparable<String> com = (Comparable<String>) o;
		CharSequence c =  (CharSequence) o;
	}
}
