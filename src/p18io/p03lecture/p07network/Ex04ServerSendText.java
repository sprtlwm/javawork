package p18io.p03lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex04ServerSendText {
	public static void main(String[] args) throws Exception{
		ServerSocket svt = new ServerSocket();
		svt.bind(new InetSocketAddress("172.30.1.44",33333));
		
		System.out.println("연결준비+++++");
		Socket st = svt.accept();
		System.out.println("연결성공++++");
		
		Scanner scan = new Scanner(System.in);
		OutputStream os = st.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String input = "";
		boolean run = true;
		
		while(run) {
			System.out.print("입력:");
			input = scan.nextLine();
			
			if(input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		scan.close();
		st.close();
		svt.close();
	}
}
