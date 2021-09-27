package p14lambda.p03lecture;

public class Ex04Return {
	public static void main(String[] args) {
		MyInterface4 o1 = new MyInterface4() {
			public int method() {
				return 1;
			}
		};
		System.out.println(o1.method());
		
		MyInterface4 o2 = () -> {return 2;};
		System.out.println(o2.method());
		
		//��ɹ��� �ϳ��� ������ ��ɹ��̶��
		MyInterface4 o3 = () -> 3; // return Ű���� ��������
		System.out.println(o3.method());
	}
}

interface MyInterface4 {
	int method();
	
}