package ex2_overloading;

public class Carc {
	//직사각형의 넓이를 구하는 area메서드를 작성
	//넓이는 메서드에서 출력하고 종료
	public void area (int width , int height) {
		System.out.println("직사각형의 넓이: "+ width * height);
	}
	
	//오버로딩 해서 정사각형의 넓이를 구하는 매서드 만들기
	//길이는 매개변수로 받는다
	//넓이는 반환 받는다
	public int area (int lenght) {
		return lenght * lenght ;
		
	}

}
