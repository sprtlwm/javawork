package p15collection.p02quiz.p03map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex13leetcodTest {

	@Test
	void test() {
		
		Ex13leetcode e = new Ex13leetcode();
		
		assertEquals(0, e.firstUniqChar("leetcode"));
		assertEquals(2, e.firstUniqChar("loveleetcode"));
		assertEquals(-1, e.firstUniqChar("aabb"));
	
	}

}
