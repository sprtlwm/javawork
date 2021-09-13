package p11api.p03lecture.p03object.p03equals;

public class Ex02 {
	public static void main(String[] args) {
		Book b1 = new Book("자바다", "신");
		Book b2 = new Book("파이썬", "손");
		Book b3 = new Book("파이썬", "손");
		
		System.out.println(b1==b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		
		System.out.println("=================");
		
		System.out.println(b2 ==b3);
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b2.equals(b3));
	}
}

class Book{

	private String title;
	private String writer;
	
	public Book(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}
	
	public int hashCode() {
		return title.hashCode() + writer.hashCode(); // 필드 title과, 필드 writer가 같으면 같은 hashcode 생성
	}
	
	public boolean equals(Object obj) {
		Book otherBook = (Book) obj;
		
		return title.equals(otherBook.title) && writer.equals(otherBook.writer);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}
	
	
}
