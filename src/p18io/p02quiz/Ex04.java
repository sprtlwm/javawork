package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
//		String file = "C:\\Users\\MSI PC\\Desktop\\iotest\\outtest2.jpg";
		InputStream is = new FileInputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\다운로드.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\outtest2.jpg");
		
		int data = 0;
		while((data = is.read()) !=-1) {
			os.write(data);
		}
		
		
		System.out.println("프로그램 종료");
		
		is.close();
		os.close();
	}
}
