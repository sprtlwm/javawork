package p10exception.p02quiz;

public class WorngPasswordException extends Exception{

		public WorngPasswordException() {}
		
		public WorngPasswordException(String message) {
			super(message);
		}
}
