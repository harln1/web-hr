package ex5_operator;

public class SingleOperatorExample {

	public static void main(String[] args) {
		//부호를 결정하는 연산자
		int x = -100;
		x = -x;
		System.out.println("x의 값: "+x);//(+) 100
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//++ : 1을 증가
		//-- : 1을 감소
		
		//전위연산
		//연산자가 앞에 오는 연산이다.
		int a = 5;
		System.out.println(++a);//6
		//후위연산
		//연산자가 피연산자 뒤에오는 연산
		//사용을 먼저하고 연산이 나중에 이어진다.
		int b =5;
		System.out.println(b++);//b 를 먼저 호출하고 그 다음 나중에 연산
		System.out.println(b);
		
		//증감연산자 ++x => x = x+1;
		x = 5;
		int result = ++x + x++;
		System.out.println(result);//6+6=12
		System.out.println(x);//7
		
		x = 2;
		int y = 3;
		int z = x++ + ++y;
		//x,y,z 의 값을 구하기
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);//2+4=6
		
		//논리부정연산자
		//!논리형데이터
		boolean isOn = true;
		System.out.println(!isOn);

	}

}
