package p10exception.p03lecture.p05throw;

import java.io.IOException;

public class Example2ThrowEXception {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		//RuntimeException을 상속 받지 안은 Exception은 try,catch를 사용해야함
		
		IOException e = new IOException();
		
		try {
			throw e;
		}catch(IOException e1) {
			System.out.println("IO익셉션 발생");
		}
			
	}
}
