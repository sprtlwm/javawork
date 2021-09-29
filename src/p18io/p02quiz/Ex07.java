package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {

	public Map<Character, Integer> count(String fileName) throws Exception {
		
		Reader r = new FileReader(fileName);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int c = 0;
		
		while ((c= r.read()) !=-1) {
			if(map.containsKey((char)c)) {
				map.put( (char) c, map.get( (char)c) + 1);
			}else {
				map.put((char)c, 1);
			}
			
//			map.merge((char) c, 1,(old, n)-> old + n);
		}
		r.close();
		return map;
	}
}
