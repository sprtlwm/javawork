package p18io.p03lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Ex05ClientGetText {
	public static void main(String[] args) throws Exception{
		Socket st = new Socket();
		
		System.out.println("연결시도=====");
		st.connect(new InetSocketAddress("172.30.1.44",33333));
		System.out.println("연결 성공=====");
	
		InputStream is = st.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = "";
		
		while((line = br.readLine()) !=null) {
			System.out.println("출력: "+line);
		}
	
		br.close();
		st.close();
	}
}
