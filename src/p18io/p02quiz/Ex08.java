package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {
	public String split(int num) throws Exception{
		String name ="C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader r = new FileReader(name);
		char[] datas = new char[num];
		
		String res ="";
		int cnt = 0;
		while((cnt =r.read(datas))!=-1) {
			res += new String(datas,0,cnt)+",";
		}
		r.close();
		
		
		return res.substring(0, res.length()-1);
	}
}
