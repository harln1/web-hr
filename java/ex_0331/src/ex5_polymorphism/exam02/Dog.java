package ex5_polymorphism.exam02;

//추상클래스를 상속받은 클래스는 츄상메서드르 반드시 오버라이딩 해야함
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}


