package p18io.p03lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex07OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		OutputStream os = getoutputStream("C:\\Users\\MSI PC\\Desktop\\iotest\\outtestH.txt");
		Writer wr = new OutputStreamWriter(os);
		
		wr.write('a');
		wr.write('한');

		wr.close();
	}
	
	public static OutputStream getoutputStream(String file) throws Exception{
		
		return new FileOutputStream(file);
	}
}
