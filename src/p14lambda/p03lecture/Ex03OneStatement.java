package p14lambda.p03lecture;

public class Ex03OneStatement {
	public static void main(String[] args) {
		MyInterface3 o1 =()->{
			for(int i =1; i<=5; i++) {
				System.out.println(i);
			}
		};
		o1.method();
		
		MyInterface3 o2 = ()->{
			System.out.println("���๮2");
		};
		o2.method();
		
		//��ɹ��� �ϳ��� �߰�ȣ ��������
		MyInterface3 o3 =()->System.out.println("���๮3");
		o3.method();
	}
}

interface MyInterface3{
	void method();
}