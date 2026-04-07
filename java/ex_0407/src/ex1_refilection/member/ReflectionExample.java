package ex1_refilection.member;

import java.lang.reflect.Constructor;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//getDeclaredConstructors() 생성자 정보읽기
		System.out.println("[생성자 정보]");
		Constructor [] constructors=
				clazz.getDeclaredConstructors();
		// c.getParameterTypes() 매개변수의 타입을 반환
		for(Constructor c : constructors) {
			System.out.println(c.getName()+"(");
			Class[] parameters = c.getParameterTypes();
		}
	}
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getSimpleName()); 
			if (i < parameters.length - 1) {  
				System.out.print(") ");
			}

		}

	}
}
