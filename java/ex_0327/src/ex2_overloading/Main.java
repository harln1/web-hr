package ex2_overloading;

public class Main {
	public static void main(String[] args) {
		OverloandingExample o = new OverloandingExample();
		
		//메서드 오버로딩의 장점 
		//같은 이름으로 여러가지 타입의 매개값 처리 가능
		int result = o.plus(1, 2);
		double result2 = o.plus(1.0, 2.0);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println( );
		
		Carc a  = new Carc();
		a.area(2, 4);
		
		int result3 = a.area(6);
		System.out.println("정사각형의 넓이: "+ result3);
		
	}

}
