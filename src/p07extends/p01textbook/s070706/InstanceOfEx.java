package p07extends.p01textbook.s070706;

public class InstanceOfEx {

 public static void method1(Parent parent) {
	
	 if(parent instanceof Child) {
		 Child child = (Child) parent;
		 System.out.println("method1 - Child로 변환");
	 }else {
		 System.out.println("method1 - child로 변환되지 않음");
	 }
 }
 
 	public static void method2(Parent parent) {
 		
 		Child child = (Child)parent;
 		System.out.println("method2 - Child로 변환");
 		}
 	
 	public static void main(String[] args) {
		
 		Parent parentA = new Child();	//값을 할당코드 --작성
		 method1(parentA);
		 method2(parentA);
	
		 Parent parentB = new Parent();	//값을 할당코드 --작성
		 method1(parentB);
		 method2(parentB);
 	}
 	
 }
