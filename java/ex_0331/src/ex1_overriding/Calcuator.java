package ex1_overriding;
//부모
public class Calcuator {
	
//반지름을 외부에서 받아 원의 넓이를 반환하는  areaCircle메서드 작성
	//ㄴ원의 넓이 3.14159*반지름*반지름
	
	
	public double areaCircle( double r) {
		System.out.println("Calcuator객체의 areaCircle실행");
		return 3.14159*r*r;
	}
}
