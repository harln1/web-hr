package customException.ex2_object;

public class Student {
	
	private int no;
	private String name;
	
	public Student (int no, String name) {
		this.no = no;
		this.name = name;
		
		
		
	}

	//Object클래스의ㅡ hashcode()메서드 오버라이딩
	//학생번호와 이름 해시코드를 합한 새로운 해시코드를 반환
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
}
