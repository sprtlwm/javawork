package p11api.p02quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
	while(true) {	
	
		System.out.print("입력문자열:");
		String in = scan.nextLine();
		
		System.out.print("구분자:");
		String dm = scan.nextLine();
	
		String[] arr1 = in.split(dm);
//		for(String str : arr1) {
//			
//			System.out.println(str);
//		}
		System.out.println(Arrays.toString(arr1));
		}
	}
}
