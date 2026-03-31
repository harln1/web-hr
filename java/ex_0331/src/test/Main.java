package test;

public class Main {
	public static void main(String[] args) {

		//필드에 값을 초기화 하는 방법 3가지

		
		//1.필드에 직접 값 넣기
		//필드 접근 p 내가 만든 객체로 접근
		//객체생성 (new-메모리heap에 공간 확보 / Person()생성자의 호출  확보된 공간에 객체를 만든다)
		Person p = new Person();
		p.name = "홍길동";
		p.age = 30;
		
		//2. 생성자를 통해 초기화
		
		Person p2 = new Person("박길동",40);
		
		//3.setter,getter(메서드 통해 초기화하기)
		Person p3 = new Person();
		p3.setName("김길동");
		p3.setAge(20);
		
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
	}

}
