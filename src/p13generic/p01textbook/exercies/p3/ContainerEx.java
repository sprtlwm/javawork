package p13generic.p01textbook.exercies.p3;

public class ContainerEx {
public static void main(String[] args) {
		Container<String, String> contain1 = new Container<>();
		contain1.set("È«±æµ¿","µµÀû");
		String name1 = contain1.getKey();
		String job = contain1.getValue();
		
		Container<String, Integer> contain2 = new Container<>();
		contain2.set("È«±æµ¿",35);
		String name2 = contain2.getKey();
		int age = contain2.getValue();
	}
}
class Container<T, U>{

	public void set(T string, U i) {
		
		
	}

	public U getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getKey() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
