package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex04Equals {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("java");
		set1.add("java");
		set1.add(new String("java"));
		set1.add(new String("java"));
		//스트링은 해시코드와 이퀄즈로 재정의 되었기에 중복저장이 안됨
		System.out.println(set1.size());
		
		System.out.println("============");
		
		Set<Car> set2 = new HashSet<>();
		
		set2.add(new Car("sonata", 888));
		set2.add(new Car("avante",777));
		set2.add(new Car("volvo", 999));
		set2.add(new Car("volvo", 999)); // 타 클래스에서는 Set이 정의 되어있지 않기에 중복처리되지 않음
		
		System.out.println(set2.size());
		//타 클래스의 해시코드 재정의 
		for(Car car : set2) {
			System.out.println(car);
		}
	}
}

class Car{
	
	private String model;
	private int number;
	
	public Car(String model, int number) {
		super();
		this.model = model;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", number=" + number + "]";
	}
	
	//해시코드 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
}