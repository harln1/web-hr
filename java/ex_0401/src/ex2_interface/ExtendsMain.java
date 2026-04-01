package ex2_interface;

public class ExtendsMain {
	public static void main(String[] args) {
		Interfacelmpl impl = new Interfacelmpl();
		
		//인터페이스의 타입 변환
		//인터페이스와 구현클래스 사이에서 발생
		//자동타입변환 
		//구현객체 를 인터페이스 타입변수에 대입할때 
		//강제타입변환
		InterfaceA ia = impl;
		ia.methodA();
	//  ia.methodB();
    //  ia.methodC();
		
		System.out.println();

		InterfaceB ib = impl;
	//	ib.methodA();
		ib.methodB();
   //   ib.methodC();
		
		//C는 다른 interface 를 상속받아 다사용가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
