package com.example.demo.di1;

class Car{};
class SportCar extends Car{};
class Truck extends Car{};

public class Main1 {
	public static void main(String[] args) {
		//객체가 필요하다(필드 메서드를 사용하기 위해서)
		//변경사항이 발생했을 때 타입이랑 생성자 부분을 모두 변경해야함
		//다형성을 이용하면 수정을 해야하는곳이 적어짐
		//Car car = new Truck();
		
		//별도의 메서드를 만들어서 객체를 수정하면 수정포인트를 더 줄일 수 있따
		Car car = getCar();
	}
	
	static Car getCar() {
		return new SportCar();
	}

}
