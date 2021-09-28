package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) {
		List<Car> list = Arrays.asList(new Car("tesla",500), new Car("kia", 300), new Car("volvo", 200), new Car("fiat", 400));
		
		list.sort((c1 , c2) ->c1.getPrice() - c2.getPrice());
		
		list.forEach(c ->System.out.println(c.getName() + " : " +c.getPrice()));

	}
}

class Car {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}