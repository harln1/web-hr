package ex1_lambda;

public class CalculatorService {

	// 람다를 매개변수로 받는 메서드
	public void execute(Calculator calculator) { // main의 c가 여기로 넘어옴
		int result = calculator.calc(10, 20); // (a,b) -> a+b; <= 10,20
		System.out.println("결과 : " + result);
	}

	// 람다를 반환하는 메서드
	
	// 매개변수로 "add"문자열이 ㅇ넘어오면 두수를 더함
	// "sub"문자열이 넘어오면 두수를 빼서 반환
	public Calculator getCalculator(String type) {
		if (type.equals("add")) {
			return (a, b) -> a + b;
		} else if (type.equals("sub")) {
			return (a, b) -> a - b;
		} else {
			return (a, b) -> 0;
		}

	}
}
