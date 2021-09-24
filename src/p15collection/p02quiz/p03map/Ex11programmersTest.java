package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex11programmersTest {

	@Test
	void test() {
		Ex11programmers e = new Ex11programmers(); 
	
		assertEquals("leo", e.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		assertEquals("vinko",e.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},new String[] {"josipa", "filipa", "marina", "nikola"}));
		
		assertEquals("mislav", e.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
		assertEquals("mislav", e.solution(new String[] {"mislav", "stanko", "stanko", "mislav", "ana"}, new String[] {"stanko", "stanko", "ana", "mislav"}));
	}

}
