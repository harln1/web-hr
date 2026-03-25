package ex2_while;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		//1. 반복문의 while 
		
		int x = 1;
		
		while (x < 4) {
			System.out.println(x);
			x++;  //=> 초기식의 값을 변화시켜줄 수 있는 증감식을 따로 작성해줘야한다.
		}
		//무한루프 문 
		//: x의 값이 변하지않으면 조건이 거짓이 될 수 없기때문에 무한으로 돌게 된다.
		
		//문제 [1] 1~6사이의 난수를 뽑아 저장하세요.
		int rand = (int)(Math.random()*6) + 1;
		//정답을 키보드에서 입력 받고 정답을 맞출때 까지 반복
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		//몇번만에 맞출지 모름
//		while ( answer != rand) {
//			System.out.println("정답 : ");
//			answer = sc.nextInt();
//			
//			if(answer == rand) {
//				System.out.println("정답을 맞추셨습니다!");
//			}
//		}
		
		//문제[2] while문을 이용해서 1~100까지의 총 합 구하기
		int i = 1;
		
		//총합,갯수 구하기 = 결과를 담아줄 변수 구하기
		int total = 0;
		
		while (i<=100) {
			total += i;
			i++;
			
		}
		System.out.println("1~100까지의 총 합:"+ total);
		
		
		//문제 [3] 키보드에서 정수를 입력받아서 각자리의 합을 더한 결과를 출력 ,예를들어 12345입력 -> 1+2+3+4+5 를 더한 15출력
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int total2 = 0;
		
		while (num > 0) {
			total2 += num % 10;//맨 마지막 꺼 1,2,3,4,5라했을때 0+5,+4,+3,+2,+1
			num = num/10; //1,2,3,4
		}
		System.out.println("각 자리의 총 합 :"+ total2);
		
	}

}
