package ex1_lambda;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		CalculatorService cs = new CalculatorService();

		Calculator c = (a, b) -> a + b;
		cs.execute(c);

		cs.execute((a, b) -> a + b);// 직접바로 전달도 가능

		// 람다식을 반환받아서 사용
		Calculator add = cs.getCalculator("add");
		Calculator sub = cs.getCalculator("sub");

		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(8, 6));

		TextService ts = new TextService();
		String text = "This product is currently out of stock.";

		String result = ts.processText(text, (t) -> t.toUpperCase());
		System.out.println("대문자 변환: " + result);

		String result2 = ts.processText(text, (t) -> t.replace("out of stock", "in stock"));
		System.out.println("문구 변경: " + result2);

		UserService us = new UserService();
		List<User> users = List.of(
				new User("김철수", 25, "서울"),
				new User("이영희", 18, "인천"), 
				new User("김민수", 30, "부산"),
				new User("박지은", 22, "서울") );

		System.out.println("\n나이가 20살 이상인 회원");
		us.filterUsers(users, us.getFilter("adult"));

		System.out.println("\n거주지 가 서울인 회원");
		us.filterUsers(users, us.getFilter("seoul"));

		System.out.println("\n이름이 김으로 시작하는 회원");
		UserFilter kimFilter = us.getFilter("kim");
		us.filterUsers(users, kimFilter);
	}
}