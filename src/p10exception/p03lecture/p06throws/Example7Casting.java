package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example7Casting {
	public static void main(String[] args) {
		//try catch
		
		try {
			throw new NullPointerException();
		}catch(Exception e) {
			System.out.println("익셉션 발생");
		}
	}
	public static void method() throws Exception {
		
		throw new IOException();
		
	}
}
