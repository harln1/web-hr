package ex1_innerclass.staticclass;



public class Outer {
	int a = 10; //일반필드(멤버변수)
	static int b = 20; //정적필드(클래스변수)
	
	static class Inner {
        void print() {
            // System.out.println(a); // [에러] static은 인스턴스 변수에 직접 접근 불가
            System.out.println(b);    // [성공] static 멤버끼리는 접근 가능
        }
		
        void print(Outer outer) {
            System.out.println(outer.a); // [성공] 전달받은 'user' 객체의 a를 출력
        }
    }
}

