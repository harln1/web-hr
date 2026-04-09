package ex1_ganeric.superEx;

//<? super T> : T 또는 T의 부모타입만 허용
//값을 넣는것(add)에 강하다
//꺼낼때는 Object로만 안전하게 받을수있다

public class Animal {
	
	public void speak() {
		System.out.println("동물소리");
	}

}
