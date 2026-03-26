package ex3_class;

public class CarMain {
	public static void main(String[] args) {
		
	
	//Scanner  는 자바에서 제공한 클래스다
	//Scanner  변수명 = new Scanner();
	Car c = new Car(); //자동차를 1대 만듦

	//객체를 통해 필드에 접근하는 법
	//변수명. 필드명;

	c.price = 10000000;
	c.color = "white";
	c.brand = "HYNDA";

	System.out.println("가격: " + c.price);
	System.out.println("색상: " + c.color);
	System.out.println("브랜드: " + c.brand);

	//두번째 자동차 객체 만들기
	Car c2 = new Car();
	c2.price =9000000;
	c2.color= "Black";
	c2.brand= "LIA";
	System.out.println(c);
//하나의 파일에서 여러개의 클래스를 추가하는것도 가능하다 
	class Truck{};
	class Bus{};
	
	
	}


}


