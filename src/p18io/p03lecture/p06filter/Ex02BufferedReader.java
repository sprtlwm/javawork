package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex02BufferedReader {
	public static void main(String[] args) throws Exception {
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestE.txt";
		Reader re = new FileReader(name);
		BufferedReader br = new BufferedReader(re);
		
		long start = System.currentTimeMillis();
//		while(re.read() != -1) {
		while(br.read() != -1) {	
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start +"ms");
		br.close();
		re.close();
	}
}
