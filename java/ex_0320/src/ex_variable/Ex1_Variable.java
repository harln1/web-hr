package ex_variable;

public class Ex1_Variable {

	public static void main(String[] args) {
//		System.out.println(10);
//		System.out.println(3.14);
//		System.out.println("홍길동");
		
		int x ; //x라는 이름의 정수타입 변수 선언
		x = 10; //변수 x 에 10 을 대입
		System.out.println(x);
		System.out.println(x+1);//11
		
		System.out.println(x);//10
		
		x= 55;
		System.out.println(x);//55
		
		x = x+1;//56
		System.out.println(x+1);//57
		System.out.println(x);//56

		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간"+minute+"분");
		
		//3시간 5분이 총 몇분인지 구하기 << 시간x60+분
		int totalMinute = hour*60+minute;
		System.out.println("총"+totalMinute+"분");
		
		
		//변수는 또 다른 변수에 대입되어 메모리 간의 값을 복사 할 수 있다.
		int a = 3;
		int b = a;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
