package ex1_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Printer {
    public void print(String message) {
        System.out.println(message); 
    }
}

class Person {
    String name; // name 필드 추가

    public Person() { // public name() 에서 수정됨
    	System.out.println("객체생성");
    } 
    public Person(String name) {
    	this.name = name;
    }
}

public class Main {
	
	public static void executePrint(Consumer<String> action, String message) {
        action.accept(message);
    }
	public static void main(String[] args) {
		//메서드 참조: 람다식을 더 짧게 쓸 수 있는 참조
		//이미 존재하는 메서드를 그대로 호출만 하는 형태일때 사용가능
		List<String> names = Arrays.asList("Kim" , "Lee" , "Park");
		//메서드를 참조 하는 이유
		//names.forEach(s-> System.out.println(s));
		
		//람ㄷ아식은 리스트에 있는 요소를 받아서 출력한 상태다
		//직접 계산을 하거나 로직을 조합만 하는 상태이다
		//기존에 있ㄴ믄 메서드를 전달만 한 상태이다
		names.forEach(System.out::println);
		
		//의미는 같으나 코드가 더  짧고 의도가 분명하다
		
		//메서드 참조 사용하는법
		//클래스명::메서드명
		//변수명::메서드명
		
		//메서드 참조의 4가지 종류
		//1.static메서드 참조
		//클래스명::메서드명
		
		//문자열을 전달받아서 정수로 변환하는 람다식 만들기
		
		Function<String, Integer> f1= Integer::parseInt;
		System.out.println(f1.apply("100"));
		
		//2.특정 객체의 메서드를 참조 할떄
		//객체변수명 :: 메서드명
		Printer printer = new Printer();
		Consumer<String> c1= printer::print;
		c1.accept("Hello");	
		//핵심. 어떤 객체를 사용할지 이미 정해져있다
		
		//3.임의 객체의 메서드 참조
		BiFunction<String, String, Integer> f2 = (a,b)->a.compareTo(b);
		//첫번쨰 매개변수 ->메서드를 호출할 객체
		
		//두번째 매개변수->그메서드의 인자
		//(a,b)->a.compareTo(b)
		//a가 메서드를 호출하는 주체
		//b가 메서드의 인자
		
		System.out.println(f2.apply("apple", "banana"));
		
		//4.생성자의 참조
		//클래스명::new
		//Supplier<Person> s1 = () -> new Person();
		Supplier<Person> s1 = Person::new;
		//Function<String, Person> f3 = name -> new Person(name);
		Function<String, Person> f3 = Person::new;
	
		
		Person p1 = s1.get();
		Person p2 = f3.apply("홍길동");
		
		Printer printer2 = new Printer();
		executePrint(printer2::print, "람다식 전달 연습");
	}
}
