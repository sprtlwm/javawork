package p13generic.p01textbook.s130501;

public class BoundTypeParameterEx {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); X
								//  ��Ʈ���� �ѹ� Ÿ���� �ƴ�
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}
