package p18io.p03lecture.p03reader;

import java.io.FileReader;

public class Ex04 {
	public static void main(String[] args)throws Exception {
		String name ="C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader r = new FileReader(name);
		char[] datas = new char[3];
		
		int cnt = 0;
		
		while((cnt =r.read(datas)) != -1) {
			for(int i = 0; i<cnt; i++) {
				System.out.print(datas[i]+",");
			}
		}
		
		r.close();
	}
}
