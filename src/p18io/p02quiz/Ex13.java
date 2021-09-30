package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		String src = "src/p18io/p02quiz/Ex13.java";
		String des = "C:\\Users\\user\\Desktop\\iotest\\Ex13.java";
		
		Reader re = new FileReader(src);
		BufferedReader br = new BufferedReader(re); 
		Writer wr = new FileWriter(des);
		BufferedWriter bw = new BufferedWriter(wr);
		
		
		String line = "";
		int c = 0;
		
		while((line = br.readLine()) !=null) {
			c++;
			bw.write(c+":"+line);
			bw.newLine();
		}
		
		
		
		
		
		
		br.close();
		bw.close();
		re.close();
		wr.close();
	}
}
