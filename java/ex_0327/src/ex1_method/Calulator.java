package ex1_method;

public class Calulator {
	//계산기 기능이 있는 메서드
	//숫자 2개 , 문자열 타입의 연산자
	public int getResult(int x , int y, String op) {
		if(op.equals("+")) {
			return x + y;
		}else if(op.equals("-")) {
			return x-y;
		}else if(op.equals("*")) {
			return x*y;
		}else if(op.equals("/")) {
			return x/y;
		}else {
			System.out.println("연산 기호가 올바르지 않습니다");
			return -1;
		}
		
	}

}
