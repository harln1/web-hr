package ex2_system;

import java.util.Scanner;

public class SystemFieldExample {
	public static void main(String[] args) {
		//System.out
		//표준 출력 장치
		//콘솔에 메시지를 출력할 때 사용한다
		System.out.println(System.out);//java.io(패키기).PrintStream(클래스)@1176dcec(주소)
		
		//System.in
		//표준입력장치
		//키보드에서 입력을 받을 때 사용
		System.out.println(System.in);
		
		//System.err
		//표준에러 출력 장치
		//오류 메시지를 출력할 때 사용
		System.out.println(System.err);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.일반 출력은 System.out");
		System.err.println("2. 에러출력은 System.err");
		
		System.out.println("3. 이름을 입력하세요: ");
		String name  = sc.next();
		
		System.out.println("입력한 이름 :"+ name);
	}

}
