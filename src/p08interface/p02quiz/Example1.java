package p08interface.p02quiz;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * interface Sword 만들고
		 * 구현클래스
		 * FireSword, RainbowSword
		 */
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FireSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack();
	}
}
