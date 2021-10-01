package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex06INputStreamReader {
	public static void main(String[] args) throws Exception{
		InputStream is = getInputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\test5.txt");
		Reader re = new InputStreamReader(is);
		
		System.out.println((char)re.read());
		System.out.println((char)re.read());
		System.out.println((char)re.read());
		System.out.println((char)re.read());
		
		re.close();
		
	}
		public static InputStream getInputStream(String file) throws Exception{
		
			return new FileInputStream(file);
		}
}

