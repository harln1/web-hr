package ex1_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//어노테이션
//자바코드에 붙이는 표식
//컴파일러에게 " 이 코드에는 어떤 의미가 있다" 라고 알려주는 정도
//@Setter
//@Getter
//@ToString//오버라이딩 기능을 제공
//@NoArgsConstructor //기본생성자
@AllArgsConstructor//모든 필드(변수)를 매개변수를 갖는 생성자
@RequiredArgsConstructor //final또는 @NonNull이 붙은 필드만 매매변수로 갖는 생성자
@Data //Getter Setter, hashCode(),eqyaks(),toString() 메서드가 자돋으로 생성

public class Member {
	
	private final String id;
	private String name;
	private int age;
	
//	//1.생성자를 이용하여 초기화 하기,
//  @AllArgsConstructor -> lombok가 다 만들어준다
//	public Member (String id,String name ,int age) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	
//	//2. setter & getter
//	@Setter @Getter-> lombok가 다 만들어줌
//	public void setId(String id) {
//		this.id = id;
//	}
//	private void setName(String name) {
//		this.name = name;
//
//	}

}
