package ex1_method;

import java.util.Iterator;

public class MethodExample {
	
	/*
	 * 메서드 구조 
	 * 접근 제한자 반환형 메서드명(매개변수){
	 * 	실행하고자 하는 명령
	 * 	return 반환값;
	 * }
	 * 
	 * 반환할 값이 없으면 반환형은 void
	 * 외부에서 받을 값이 없으면 매개변수는 생략 가능하다
	 */
	
	//"메서드가 호출되었습니다" 라고 출력되는  printInfo 메서드 작성해보기
	public void printInfo() {
		System.out.println("메서드가 호출 되었습니다");
		
	}
	
	//두 수를 더하여 반환하는 add 메서드 작성
	public int add(int a, int b) { //반환할때의 타입 : z =>int
		
		return a+b ; //반환할땐 return
	}
	
	//원의 넓이를 구하는 circleArea 메서드 작성하기 
	//원의 넓이 :3.14 *반지름*반지름
	//반지름을 외부에서 받아서 넒이를 정하기
	
	//1.메서드를 정의한다
	public double circleArea(double r) {//2외부에서 받을 값이 있으면.double r 매개변수 준비
		return 3.14*r*r; //3. 연산 결과를 보내줘야하면 return 계산 식 준비
		
	}
	
	//원의 둘레를 구하는 circleRound메서드 정의
	//반지름은 외부에서 전달받는다
	//원의둘레 : 2*3.14*반지름
	//메서드 내부에서 둘레를 구하고 출력한 다음에 종료
	
	public void circleRound(double r2) {
		System.out.println( 2*3.14*r2);

	}
	
	//정수 배열을 매개변수로 받아서 짝수의 개수를 반환하는 countEven메서드 작성
	public int countEven(int [] num) {
		int count = 0;
		for (int i : num) {
			if(i % 2 == 0) {
				count++;
				System.out.print(i+" ");
			}
		}
		
		
		return count;
	}
	
	//메서드를 만드는 이유 자주사용되는 기능을 재사용하기 위함
	
	
	
	//특정 문자 개수 세기
	//문자열과 문자 하나를 매개변수로 받아서
	//문자열에서 해당 문자가 몇번 등장하는지 반환하는 countChar메서드 작성하기


	public int countChar(String a , char b) {
		int count = 0;

		for (String str: a.split("")) {
			if (str.charAt(0)== b)
				count++;
		}
		
		return count;
	}
	

}
