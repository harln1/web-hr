package ex4_class_casting;

//부모클래스
class Animal{
	public void sound() {
		System.out.println("동물이 소리를 낸다");
	}
}

class Dog extends Animal{
	@Override
	public void sound () {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class TypeCastingExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//클래스의 자동타입 변환
		//자식객체 -> 부모타입변수에 대입
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.sound();
		a2.sound();
		
		//부모타입의 배열에 서로다른 자식 ㄱ객체를 넣을 수 있단 장점이있다
		Animal[] array = {new Dog(),new Cat()};
	}

}
