package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\MSI PC\\Desktop\\iotest\\outtest2.txt";
		OutputStream os = new FileOutputStream(file);
		
		for(int i = 0; i<1024; i++) {
			os.write(0);
		}
		
		System.out.println("프로그램 종료");
		os.close();
	}
}
