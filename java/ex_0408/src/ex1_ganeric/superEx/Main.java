package ex1_ganeric.superEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	//List<? super Dog> list에서 허용되는 타입
	//List<Dog>,List<Animal>,List<Object>
	//List<Puppy>는안됌
	public static void addDog (List<? super Dog> list) {
		list.add(new Dog());
		list.add(new Puppy());//Puppy 객체는 Dog로 취급
	}
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Puppy> puppiList = new ArrayList<Puppy>();
		//둘다가능
		addDog(animalList);
		addDog(dogList);
		//puppy는 Dog의 자식 클래스 여서 <불가능>
		//addDog(puppyList);
		
		//각 리스트에 들어있는 객체의 메서드 호출하기
		
		System.out.println("animalList: ");
		for (Object o : animalList) {
		   ((Animal)o).speak();
		}
		System.out.println("DogList: ");
		for (Dog o : dogList) {
			o.speak();
		}
		
	}

}
