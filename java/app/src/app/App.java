
package app;

import java.util.Scanner;
import member2.Member;

import service.MemberService;

public class App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("나이입력: ");
		int age = sc.nextInt();
		
		Member member = new Member (name,age);
		MemberService ms = new MemberService();
		ms.register(member);
		ms.checkAdult(member);
	}

}
