package p10exception.p02quiz;

public class NotExistIDException extends Exception {

	public NotExistIDException() {}
	
	public NotExistIDException(String message) {
		super(message);
	}
}
