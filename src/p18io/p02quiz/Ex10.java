package p18io.p02quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		String src ="C:\\Users\\user\\Desktop\\iotest\\outtest9.txt";
		String des ="C:\\Users\\user\\Desktop\\iotest\\outtestB.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		char[] datas = new char[4];
		
		
		while( rd.read(datas) != -1) {
			revarse(datas);
			wr.write(datas);
		}
		rd.close();
		wr.close();
		System.out.println("프로그램 종료");
	}

	private static void revarse(char[] datas) {
		int l = 0;
		int r = datas.length-1;
		
		while(l < r) {
			char c =datas[l];
			datas[l] = datas[r];
			datas[r] = c;
			
			l++;
			r--;
		}
		
	}
}
