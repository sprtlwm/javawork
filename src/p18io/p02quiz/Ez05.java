package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ez05 {
	public static void main(String[] args) throws Exception {
		byte[] datas = new byte[] {65};
		OutputStream os = new FileOutputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\outtest4.txt");
		
		for(int i = 0; i<Math.pow(1024, 2); i++) {
			os.write(datas);
		}
		
		System.out.println("프로그램 종료");
		os.close();
		
	}
}
