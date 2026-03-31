package ex5_polymorphism.exam01;

public class Car {
	//변수선언
	Tire tire;
	
	//추가필드
	int speed;
	String brand;
	
	public void run() {
		tire.roll();
	}
}
