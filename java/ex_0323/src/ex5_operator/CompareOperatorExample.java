package ex5_operator;

public class CompareOperatorExample {
	public static void main(String[] args) {
		//관계 (비교) 연산자
		//크기비교 (<,<=,>,?=)
		//동등비교(==,!=)
				
		//비교연산자느 흐름 제어문인 조건문(if),
		//반복문에서 실행의 흐름을 제어할 때 주로 사용한다
		int num1 = 10;
		int num2 = 10;
		//비교연산자의 결과는 항상 논리형으로 반환된다.
		boolean result = num1 == num2;
		System.out.println(result);
		//같지않으면 true,같으면 false
		boolean result2 = num1 != num2;
		System.out.println(result2);
		boolean result3 = num1 <= num2;
		System.out.println(result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		
		//문자열 끼리의 비교
		String str1 = "자바";
		String str2 = "Java";
		String str3 = new String ("자바");
		//참조 자료형의 변수는 ==으로 주소값을비교한다
		boolean result5 =str1 ==str3;
		System.out.println("restlt5: "+result5);
		
		//문자열의 내용물을 비교하는 방법
		//equals() 메서드사용 자바 = 자바 true
		//변수.equals(비교하려는 변수);
		boolean result6 = str1.equals(str3);
		System.out.println("result6: "+result6);
	}

}
