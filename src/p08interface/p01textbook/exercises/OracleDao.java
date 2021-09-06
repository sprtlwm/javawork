package p08interface.p01textbook.exercises;

public class OracleDao implements DataAccessObject {

	public void select() {
		
		System.out.println("오라클DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	System.out.println("오라클DB를 수정");	
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클DB에서 삭제");
	}

	
}
