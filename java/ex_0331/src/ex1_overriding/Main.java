package ex1_overriding;

public class Main {
	public static void main(String[] args) {

 
		Animal animal = new  Animal ();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();

	}
}

