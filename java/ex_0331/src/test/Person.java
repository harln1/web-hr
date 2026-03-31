package test;

import java.util.Set;

//클래스
public class Person {
	
	String name;
	int age;
	
	
	//기본생성자정의-오버로딩을 통해서 (생성자 이름ㅇ같음Person
	public Person() {
		
	}
	public Person (String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//setter,getter
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}


}
