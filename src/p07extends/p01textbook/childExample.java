package p07extends.p01textbook;

public class childExample {

	public static void main(String[] args) {
	
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method01();
		parent.method02();
		//parent.method03();
		child.method03();
}
}
