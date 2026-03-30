package ex3_constructor;

public class Calculator {

	//static 키워드가 붙어있으면 메모리에 한번만 올라간다
	//모든 객체가 static 필드의 값을 공유한다(하나를 바꾸면 공유하는 다른객체도 값이ㅣ바뀐다)
	//원주율 파이 :3.141593
	static double pi = 3.141592;

	//외부에서 두 수를 받아 더하여 반환하는 plus 메서드 작성하기
	static public int plus(int x, int y) {
		return x+y;
		
	}
	//외부에서 두 수를 받아 더하여 반환하는 minus 메서드 작성하기
	static public int minus (int x, int y) {
		return x-y;
		
	}

}
