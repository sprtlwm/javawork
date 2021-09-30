package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01BufferedWritwe {
	public static void main(String[] args) throws Exception {
		//BufferedWriter
		//빠른속도
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestE.txt";
		Writer wr = new FileWriter(name);
		BufferedWriter bw = new BufferedWriter(wr);
//		char[] datas = new char[1024];
		
		long start = System.currentTimeMillis();
//		for(int i = 0; i < datas.length; i++) {
//			datas[i] = (char)((int)(Math.random()*26)+'a');
//		}
		for(int i =0; i<1024*1024*1024; i++) {
//			wr.write('a');
			bw.write('a');
		}
		
		bw.flush();
		long end = System.currentTimeMillis();
		
		System.out.println(end-start + "밀리세컨드");
	
		System.out.println("종료");
		wr.close();
		bw.close();
	}
}
