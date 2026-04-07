package ex2_annotaion.standard;

import java.lang.reflect.Method;

public class Parent {
	public void method() {};
}

class Child extends Parent{
	@Override//부모클래스의 메서드를 재정의
	public void method() {
		super.method();
	}
}
