package ex3_constructor;

public class Korean {

	//필드를 3개 갖고잇음
	String nation = "대한민국";
	String name ;
	String ssn ;
	
	//생성자 선언 반드시 클래스랑 이름이 같아야한다
	//클래스의 필드와 메서드의 매개변수의 이름이 겹칠때
	//	메서드 내부에선 매개변수의 우선순위가 더 높다 
	//		필드와 지역변수를 구분하기 위해 this. 꼭 사용하기
	//			this: 이 메서드를 호출 한 객체 자신을 의미한다
	public Korean(String name , String ssn) { 
		this.name = name;
		this.ssn = ssn;
	}
	
	//객체의 정보를 출력하는 printInfo매서드 만들기
	//국적,나이,주민번호
	
	public void printInfo () {
		System.out.println("국적: "+ this.nation);
		System.out.println("이름: "+this.name);
		System.out.println("주민번호: "+this.ssn);
	}
}
