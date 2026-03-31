package ex1_overriding;

public class Computer extends Calcuator{

	//@:어노테이션
	//@Override :컴파일단계에서 정확히 오버라이딩이 되었나 체크하고
	//문제가 있다면 컴파일 에러를 출력한다
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle실행");
		return Math.PI*r*r;
	}
}
