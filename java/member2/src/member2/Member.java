package member2;
//내가 회원ㄴ관리 프로그램에서 "회원"의 정의

public class Member {
	
	private String name;
	private int age;
	
	//생성자
	//접근제한자 클래스명(매개변수){}
	//필드에 값을 넣어주는법
	//1.필드에 직접넣기
	//2.생성자를 통해 초기화
	//3.setter를 통해 대입
	
	//this:해당 메서드를 호출한 객체의 정보
	public Member (String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	//setter&getter
	//한번에 한가지 필드만 세팅하거나 반환
	//set필드명,get필드명
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	


}
