package ex_test;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name= sc.next();
		
		System.out.println("JAVA점수 : ");
		int java = sc.nextInt();
		
		System.out.println("DB 점수 : ");
		int DB = sc.nextInt();
		
		System.out.println("HTML 점수 : ");
		int HTML = sc.nextInt();
		
		int total = java+DB+HTML; 
		double d = total/3.0;
		String s = (d >= 60)? "합격" : "불합격";
		
		System.out.println("이름: "+name);
		System.out.println("총점: "+total);
		System.out.println("평균: "+d);
		System.out.println("결과: "+s);
	}

}
