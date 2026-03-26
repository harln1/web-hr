package ex3_class;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student a = new Student();
//		
//		a.name = "이름";
//		a.age = 20;
//		a.score = 100;
		Scanner sc  = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		a.name = sc.next();
		System.out.println("나이을 입력하세요: ");
		a.age = sc.nextInt();
		System.out.println("점수를 입력하세요: ");
		a.score = sc.nextInt();
		
		System.out.println("이름: "+a.name);
		System.out.println("나이: "+a.age);
		System.out.println("점수: "+a.score);
		
		 
	        for (int i = 0; i < stdArray.length; i++) {
	            System.out.println((i + 1) + ". 이름: " + stdArray[i].name + 
	                               ", 나이: " + stdArray[i].age + 
	                               ", 점수: " + stdArray[i].score);
	        }
        
     
 }
}