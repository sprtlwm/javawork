package p10exception.p02quiz;

public class TextbookQuiz6 {

	public static void main(String[] args) {
		
		String[] str = {"10", "2a"};
		int val = 0; 
		
		for(int i = 0; i<=2; i++) {
			try {
				val = Integer.parseInt(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally{
				System.out.println(val);
			}
		}
		
	}
}
