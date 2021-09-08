package p10exception.p02quiz;

import java.io.FileNotFoundException;

public class Example7 {
	// 일반 예외(checked exception)을 발생 시키는 코드를 작성
	
	public static void main(String[] args) {
		
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음.");
		}
	}
	
}
