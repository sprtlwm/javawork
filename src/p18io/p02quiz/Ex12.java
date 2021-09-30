package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Ex12 {
	public static void main(String[] args) throws Exception{
		String flie = "src/p18io/p02quiz/Ex12.java";
		Reader re = new FileReader(flie);
		BufferedReader br = new BufferedReader(re);
		
		String line ="";
		int cnt = 0;
		while((line= br.readLine()) !=null) {
				cnt++;
			System.out.println(cnt + ": " + line);
		}
		
		br.close();
		re.close();
	}
}