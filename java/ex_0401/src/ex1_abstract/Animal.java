package ex1_abstract;

//추상화 목적
//부모클래스만으로는 의미있는 객체가 아니다
//부모는 공통개념일뿐 , 단독으로는 의미가 없다
public abstract class Animal {
	String name;
	//추상클래스에는 일반적인 필드나 메서드가 들어갈수XXx
	public void eat() {
		System.out.println("동물이 밥을 먹는다");
	}

	//자식 클래스가 재정의 하기위한 메서드
	//어떤 동물이 무슨 소리를 낼지는 여기서모른다/자식클래스에서 결정해야함 -> 추상클래스
	abstract public void sound(); 
		
		
	

}
