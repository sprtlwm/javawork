package p07extends.p01textbook.s070702;

public class HankookTire extends Tire{

	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		
		super(location, maxRotation);
	}
	//메소드
public boolean roll() {
		
		++accumulatedRotation;  //누적회전수 증가
		
		if(accumulatedRotation < maxRotation) {
			
			System.out.println(location + "한국타이어의 수명 :" + (maxRotation -accumulatedRotation)+ "회" );
		
			return true;		//정상회전 (누적<최대)일 경우 실행
							
		}else {
			System.out.println("*** " + location + "한국타이어 펑크  ***");
		
			return false;		//펑크 (누적 ==최대)일 경우실행	
		}
	}
}
