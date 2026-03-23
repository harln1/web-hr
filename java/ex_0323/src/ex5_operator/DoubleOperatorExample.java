package ex5_operator;

public class DoubleOperatorExample {
	public static void main(String[] args) {
		//산술연산자 +.-,*,/,% 연산자존재
		// 나누기 => /(몫),%(나머지) 사용
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result = v1 + v2; //모든 피연산자는 int로변환
		long result2 = v1+v2-v4;//모든 피연산자는 long 타입으로 바뀜
		double result3 = v1/v3;//몫
		int result4 = v1 % v2; //나머지
		System.out.println(result4 );
		
		//산술변환
		//기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 가능합니다.
		//컴퓨터는 서로 다른 타입의
		
		

	}

}
