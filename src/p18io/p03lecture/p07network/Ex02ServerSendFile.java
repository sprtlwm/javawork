package p18io.p03lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02ServerSendFile {
	public static void main(String[] args) throws Exception {

		ServerSocket svt = new ServerSocket();
		svt.bind(new InetSocketAddress("172.30.1.44", 33333));

		System.out.println("연결준비===========");
		Socket st = svt.accept();
		System.out.println("연결성공===========");

		// file InputStream
		// socket OUtputStream

		InputStream is = new FileInputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\다운로드.jpg");
		BufferedInputStream bis = new BufferedInputStream(is);

		OutputStream os = st.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);

		System.out.println("파일 전송 시작=====");
		int data = 0;
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}

		System.out.println("파일 전송 완료=====");

		bos.close();
		bis.close();

		st.close();
		svt.close();
	}
}