package p11api.p03lecture.p04wrapper;

public class Ex05 {
	public static void main(String[] args) {
		
		int i1 = 300;
		Integer i2 =300;
		
//		i1 = null; // X
		i2 = null; // O
		
		short s1 = 100; //2byt
		Short s2 = 100;
	
		i1 = s1;
//		i2 = s2; // X
//		i2 = (Integer) s2; // X
		i2 = s2.intValue();
		
		int i3 = i2 + 100; // auto unboxing
		System.out.println(i3);
		
		Object o1 = i2;
		i2 = (Integer) o1;
	}
}
