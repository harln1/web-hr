package ex5_polymorphism.exam02;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		//추상클래스는 객체를 직접 생성할 수 없다
	
		//zoo.printSound(new Animal());
		zoo.printSound(new Dog());
		zoo.printSound(new Cat());
	}

}
 