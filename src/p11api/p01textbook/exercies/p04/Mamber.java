package p11api.p01textbook.exercies.p04;

public class Mamber {
	
	private String id;
	private String name;
	
	public Mamber(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	public String toString() {
		return id +":"+ name;
	}
}
