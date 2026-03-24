package ex2_if;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		//3-2. 기본형
		int age = 17;
		if (age >= 20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
		
		//문제: 정수 하나를 입력 받아서 짝수면 "짝수" 홀수면 "홀수"
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 해주세요: ");
		int num = sc.nextInt();
		
		if (num %2==0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
	}

}
