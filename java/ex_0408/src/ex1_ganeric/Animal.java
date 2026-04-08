package ex1_ganeric;

public class Animal {
	public void makeSound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
	System.out.println("야옹");
	}
	
	
}