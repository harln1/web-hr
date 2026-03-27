package ex3_constructor;

public class Car {
	
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	//반환타입이 없다
	//생성자의 이름은 반드시 클래스명
	public Car() { //이 기본생성자가 있어야 main에서 기본생성자를 호출 할 수 있다.
		
	}
	public Car(String model) {
		this.model = model;
		
	}
	//thid()
	//현재 클래스에 선언되어 있는 생성자를 가리킬수 있도록 하는 키워드
	//모델과 색상을 초기화하는 생성자
	public Car (String model , String color) {
		this(model);
		this.color = color;
	}
	
	//모델,색상,최고속도를 초기화하는 생성자
	public Car(String model ,String color , int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
	}

}
