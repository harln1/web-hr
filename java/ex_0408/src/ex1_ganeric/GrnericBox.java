package ex1_ganeric;
/*
 * 제네릭타입 T 를 사용하는 클래스
 * item 필드 1개를 가진다 타입은 T
 * setter 로 값을 지정
 * getter로 메서드 값 받는다 
 * Main에서 GenericBox<String>객체에게 "사과" 저장후 출력
 * GenericBox<Integer>객체애 100 저장후 출력
 */
public class GrnericBox <T>{
	private T item;
	
	//item 의 값을 저장하는 setter
	public void setItem(T item) {
		this.item = item;
	}
	//item 의 값을 반환하는 getter
	public T geTItem() {
		return item;
	}


}
