package ex3_generic;

class printStudent<T,U>{
	private T name;
	private U age;
	
	public printStudent(T name,U age) {
		this.name = name;
		this.age = age;
	}
	
}
public class StudentPrinter {
	
	//제네릭 메서드 printStudent(T name , U age) 를 작성하고 이름은 문자열 , 나이는 정수로 태스트
	
	public <T, U> void printStudent(T name, U age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public static void main(String[] args) {
        StudentPrinter sp = new StudentPrinter();
        
      
        sp.printStudent("홍길동", 2);
    }
}