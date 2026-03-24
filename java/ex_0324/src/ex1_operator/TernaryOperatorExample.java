package ex1_operator;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		//2. 삼항연산자
		//조건식 ? 값1 : 값2;   >>.조건식이란 , 참 거짓을 판별할 수 있는 식
		int x = 10;
		System.out.println(x>5? "크다" : "작다");//x가 5보다 큰지? 맞으면 "크다" : 아니면 "작다"
		//==
		int z = 10;
		String result = x>5 ? "크다" : "작다";
		System.out.println(result);
		
		int a = 10;
		int b = 15;
		boolean result2 = ++a >= b ?  true: false;
		System.out.println(result2);
		//정수문자형 또한 가능ㅇ하다 
		//삼항연산자의 중첩이 가능하다
		int score = 85;
		char grade = score > 90 ? 'A': score>80 ? 'B' : 'c'; //점수가 90보다 크니? 크면 A ,점수가 80보다 크니?B ,둘다아니면 C
		System.out.println("성적 : " + grade);
	}

}
