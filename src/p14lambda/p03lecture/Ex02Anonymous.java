package p14lambda.p03lecture;

public class Ex02Anonymous {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {

			@Override
			public void method1() {
				System.out.println("�����ڵ�1");
				
			}
			
		};
		//lambda
		MyInterface2 o2 = () ->{
			System.out.println("�����ڵ�2");
		};
		
	}
}

interface MyInterface2{
	public void method1(); //�߻�޼ҵ尡 �� �ϳ�,
}
