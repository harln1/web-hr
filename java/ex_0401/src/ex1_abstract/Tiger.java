package ex1_abstract;

//추상클래스를 상속받는 메서드는 추상메서드가 존재할때
//반드시 오버라이딩하여 구체적인 내용("어흥") 을 구현해야한다=>구체화
public class Tiger extends Animal{
	
	@Override
	public void sound() {
		System.out.println("어흥");
	}

}
