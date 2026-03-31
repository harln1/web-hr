package ex1_overriding;

public class Employee {
	String name;
	
	//생성자 정의
	public Employee(String name) {
		this.name = name;
	}
	
	public int getPay() {
		return 0;
	}

}
