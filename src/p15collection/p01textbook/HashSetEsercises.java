package p15collection.p01textbook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEsercises {
	public static void main(String[] args) {
		
		Set<Student>set = new HashSet<>();
		
		set.add(new Student(1, "홍동"));
		set.add(new Student(2, "신용"));
		set.add(new Student(1, "조민"));
	
		Iterator<Student> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum +" : " +  student.name);
		}
	}
	
}
