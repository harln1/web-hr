package ex1_reflection;

//타입한정 키워드 extends
// T extends 제한타입
// Number 숫자를 다루는 클래스의 공통 부모클래스
// Integer , Double , Long , Float 
// T 엔 Number 타입이거나 Number 를 상속한 하위 클래스만 가능하다
public class Calculator<T> {
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}
