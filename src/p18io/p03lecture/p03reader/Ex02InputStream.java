package p18io.p03lecture.p03reader;

import java.io.FileReader;
import java.io.Reader;

public class Ex02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\MSI PC\\Desktop\\iotest\\test3.txt";
		Reader is = new FileReader(fileName);
		
		int b1 = is.read();
		int b2 = is.read();
		int b3 = is.read();
		int b4 = is.read();
		
		int b5 = is.read();
		int b6 = is.read();
		int b7 = is.read();
		int b8 = is.read();
		
		int b9 = is.read();
		
		System.out.println((char) b1);
		System.out.println((char) b2);
		System.out.println((char) b3);
		System.out.println(b4);
		
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		
		System.out.println(b9);
		
		
		is.close();
	}
}
