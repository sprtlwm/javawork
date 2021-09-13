package p11api.p02quiz;

public class Car {

	private String name;
	private int price;
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "회사:" + name + ", 가격:" + price + "원";
	}
}
