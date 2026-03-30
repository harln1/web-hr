package ex3_access.package1;

//같은 패키지의 다른 클래스
public class B {
	public void method() {
	A a = new A(); //A클래스가 default로 선언되어 있어서 사용가능
	
	a.field1 = 1;
	a.field2 = 2;
	//a.field3 = 3;
	//a.setField3(3);
	
	}

}
