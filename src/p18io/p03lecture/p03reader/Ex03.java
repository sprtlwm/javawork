package p18io.p03lecture.p03reader;

import java.io.FileReader;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String name ="C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader r = new FileReader(name);
		char[] datas = new char[3];
		
		int cnt1 = r.read(datas);
		System.out.println(Arrays.toString(datas));
		System.out.println(cnt1 + "개 읽음");
		
		int cnt2 = r.read(datas);
		System.out.println(Arrays.toString(datas));
		System.out.println(cnt2 + "개 읽음");
		
		int cnt3 = r.read(datas);
		System.out.println(Arrays.toString(datas));
		System.out.println(cnt3 + "개 읽음");
		
		int cnt4 = r.read(datas);
		System.out.println(Arrays.toString(datas));
		System.out.println(cnt4 + "개 읽음");
		
		int cnt5 = r.read(datas);
		System.out.println(cnt5 + "개 읽음 : -1 이면  더이상 읽을 문자가 없음");
		
		r.close();
	}
}
