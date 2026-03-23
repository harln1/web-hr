package ex5_operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean result = x >= 10 && y == 10;
		System.out.println(result);//둘다 같아야해서  false
		
		//&&: 앞이 false면 뒤는 연산하지 않는다
		
		result = (x-y)>= 10 && (++y) == 5;
		//10-5 >= 10 (f) 앞이 false 면 뒤는 그냥 연산을 안함
		//y의 값은 얼마일까 => y의 값은 5임
		
		//||앞이 true 면 뒤는 연산하지 않는다
		result = (x-y)>= 10 || (++y) == 5;
		
		//비트논리연산자
		//기능은 논리연산자와 같지만 bit단위 (2진수)의 연산만 가능하다
		//피연산자가 1,0 이라는것과 산출결과가 1,0 이라는 점이
		//1으 true 0은 false 라고 생각하면 논리연산자와 차이]
		
		//&논리곱 둘다 1이면 1,아니면 0
		//|논리합 둘 중 하나라도 1이면 1 아니면 0
		//^베타적 논리합 두 항이 다르면 1 같으면 0
		//~부정 1을 0 ,0을 1
		
		int a = 10;
		int b = 7;
		int c = a&b;
		System.out.println("c : "+c);
		
		int a2 = 12;
		int b2 = 8;
		int c2 = a2 | b2;
		System.out.println(c2);
		
		int a3 = 9;
		int b3 =11;
		int c3 =a3 ^b3;
		System.out.println(c3);
		
		int a4 = 7;//-(1+x)
		System.out.println(~a4);
		
		
		
		
		
		
		
		
		
	}

}
