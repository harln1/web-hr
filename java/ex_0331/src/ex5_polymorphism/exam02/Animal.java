package ex5_polymorphism.exam02;

// 추상 클래스: 실체 없는 설계도 역할
abstract class Animal {
    

	//추상클래스에도 일반적인 필드나 메서드가 들어갈 수 있다
	public void breath() {
		System.out.println("숨쉰다");
	}
    public abstract void sound(); 
}