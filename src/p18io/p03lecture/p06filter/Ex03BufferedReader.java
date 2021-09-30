package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex03BufferedReader {
	public static void main(String[] args) throws Exception {
		String name = "src/p18io/p03lecture/p06filter/Ex03BufferedReader.java";
		Reader re = new FileReader(name);
		BufferedReader br = new BufferedReader(re);
		
		String line = br.readLine();
		System.out.println(line);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		
		br.close();
		re.close();
		System.out.println("종료");
	}
}
