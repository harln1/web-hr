package ex4_class_casting;

class Parent{
	public void method1() {
		System.out.println("부모 메서드 1");
	}
	public void method2() {
		System.out.println("부모 메서드 2");
	}
}
class Child extends Parent{
	
	int x ;
	
	@Override
	public void method2(){
		System.out.println("자식메서드2");
	}
	public void method3() {
		System.out.println("자식메서드3");
	}
}
public class UpCastingExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		//부모타입으로 변환
		Parent parent = child;
		
		parent.method1();
		parent.method2();//부모타입으로 변환해도ㅓ 오버라이딩된 메서드가 호출
		//parent.method3();//안댐
		//parent.x()//안댐			즉, 자식 객체를 부모타입으로 변환하면 
		//							자식클래스에 정의한 멤버 (필드,메서드)를 사용할 수 없다
		((Child)parent).method3();//patrnt로 임시 자식타입 변경
		Child c2 = (Child)parent;
		c2.x = 100;
		
		
	}

}
