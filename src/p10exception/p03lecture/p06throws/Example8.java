package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws IOException {
		
		throw new IOException();
	}
	
	public static void method2() throws Exception {
		
		throw new IOException();
	}
}
