package p10exception.p03lecture.p06throws;

public class Example3ClassNotfoundException {

	public static void main(String[] args) {
		
		try {
			Class.forName("aaaaaa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
