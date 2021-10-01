package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) throws Exception {
			String src = "C:\\Users\\MSI PC\\Desktop\\iotest\\outtestF.txt";
			String des = "C:\\Users\\MSI PC\\Desktop\\iotest\\outtestG.txt";
			
			InputStream is = new FileInputStream(src);
			OutputStream os = new FileOutputStream(des);
			
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			byte[] datas = new byte[4];
			
			long start = System.currentTimeMillis();
			while( bis.read(datas) != -1) {
	
				bos.write(datas);
			}
			long end = System.currentTimeMillis();
			
			System.out.println((end-start)+"ms");
			bis.close();
			bos.close();
			
	}
}
