package ex2_if;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		//3-1.조건문의 단순 IF문
		int score = 93;
		if (score > 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 'A' 입니다");
		}
		if(score <= 90) {
			System.out.println("점수가 90 보다 작습니다.");
			System.out.println("등급은 'B' 입니다");
		}
		//문제: 정수 하나를 입력 받아서 짝수면 "짝수" 홀수면 "홀수"
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 해주세요: ");
		int num = sc.nextInt();
		
		if (num %2==0) {
			System.out.println("짝수입니다.");
		}
        if (num % 2 != 0){
			System.out.println("홀수입니다.");
		}
		/*
		 * 문제 2: 
		 * 사용자가 입력한 비밀번호가 맞는지 확인하기
		 * 키보드에서 비번을 입력받고
		 * 비밀번호:1234
		 * 입렧한 비밀번호와 일치하면 = '로그인성공'
		 * 일치하지 않으면 = '비밀번호가 일치하지 않습니다'
		 */
        
        int pass = 1234;
        System.out.println("비밀번호를 입력해 주세요 : ");
        int people = sc.nextInt();
        
        if(pass == people) {
        	System.out.println("로그인성공");
        }
        if (pass != people) {
        	System.out.println("비밀번호가 일치하지 않습니다.");
        }
	}

}
