package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		
		InputStream is = new FileInputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\다운로드.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\outtest5.jpg");
		
		byte[] datas = new byte[1000];
		
		for(int i =0; i<153; i++) {
			if(i ==152) {
				is.read(datas);
				os.write(datas, 0, 163);
			}else {
				is.read(datas);
				os.write(datas);
			}
		}
				
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
