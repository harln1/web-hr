package java26_5_27;

public class Main1 {
	public static void main(String[] args) {
		// 1. 변수: 데이터를 담는 상자
		int age = 21; //정수를 담는 상자 'age'에 21 을 넣음
		String name = "박하린";//글자를 담는 상자 'name'
		
		// 2. 조건문 : 컴퓨터에게 조건에 따라 판단하게 시키기
		if(age >= 20) {
			System.out.println(name + "님은 성인 입니다. 자바 공부를 시작하세요!");
		} else {
			System.out.println("미성년자 입니다.");
		}
	}

}
