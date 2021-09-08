package p10exception.p03lecture.p07custom;

public class ImageNotFoundException extends RuntimeException{
	

	public ImageNotFoundException() {
		
	}
	
	public ImageNotFoundException(String message) {
		super(message);
	}

	
}
