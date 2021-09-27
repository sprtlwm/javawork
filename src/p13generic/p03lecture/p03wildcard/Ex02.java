package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//파라미터나 리턴타입에 작성됨
		
		// 상위 타입 제한 
		ArrayList<? extends Number> list1 = new ArrayList<Integer>();
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
//		list1 = new ArrayList<Object>(); X
//		list1 = new ArrayList<String>(); X
		
		// 하위 타입 제한
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
//		list2 = new ArrayList<Integer>(); X
//		list2 = new ArrayList<Double>(); X
		
		// 제한 없음
		ArrayList<?> list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
		
		
	}
}
