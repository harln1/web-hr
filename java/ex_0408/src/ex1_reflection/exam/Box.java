package ex1_reflection.exam;
//제네릭이 없을때
//타입자리를 대신 할 문자
public class Box<T>{ //<T,U,V,K>도 사용가능함
	private T item;
	
	public void setItem(T item) {
		this.item = item;
		
	}
	public T geTItem() {
		return item;
	}
	
	//제네릭 메서드
	//메서드에만 적용되는 제네릭 타입을 따로 두는 것
	//제네릭클래스가 아니여도 제네릭 메서드를 만들 수 있다
	public <U> void print(U value) {
        System.out.println("제네릭 메서드 출력: " + value);
    }

}
