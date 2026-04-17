package test;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("hong", "홍길동", 20));
		members.add(new Member("kim", "김철수", 15));
		

		int count = 0;
		for (Member m : members) {
			m.printInfo();
			if (m.age >= 20)
				count++;
		}
		System.out.println("20세 이상 회원 수: " + count);
	}
}
