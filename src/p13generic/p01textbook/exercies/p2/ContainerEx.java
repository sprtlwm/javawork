package p13generic.p01textbook.exercies.p2;

public class ContainerEx {
	public static void main(String[] args) {
	Container<String> contain1 = new Container<String>();
	contain1.set("ȫ�浿");
	String str = contain1.get();
	
	Container<Integer> contain2 = new Container<Integer>();
	contain2.set(6);
	int value = contain2.get();
	
	}
}
class Container<T>{
	public void set(T string) {
		
	}

	public T get() {
	
		return null;
	}
	
}