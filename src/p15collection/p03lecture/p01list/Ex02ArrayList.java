package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex02ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		//add
		
		arr1.add(999);
		arr1.add(444);
		arr1.add(322);
		
		//size
		
		System.out.println(arr1.size());
		
		arr1.add(123);
		arr1.add(932);
		
		System.out.println(arr1.size());
		
		//get
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
	
		//remove
		arr1.remove(3);
		
		System.out.println(arr1.size());
		
		System.out.println(arr1.get(3));
		
	}
}














