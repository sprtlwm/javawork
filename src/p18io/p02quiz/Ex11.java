package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestD.txt";
		Writer wr = new FileWriter(name);
		Scanner scan = new Scanner(System.in);
		
		boolean run = true; 
		
		while(run) {
			System.out.print("입력:");
			String anser =scan.nextLine(); 
			wr.write(anser + "\n");
			if(anser.equals("exit")) {
				break;
			}
		}
		
		
		wr.close();
		scan.close();
	}
}
