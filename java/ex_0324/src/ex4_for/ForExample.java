package ex4_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		//지역변수 :특정 영역 내에서 만들어진 변수는 해당영역 내에서만 사용할 수 있음
		//안에서 만들어진 변수는 바깥에서 사용할수 없지만, 바깥에서 만든 변수는 안쪽애서 사용할ㅇ수있다
		for(int i = 1; i<=3 ; i++) {//1<=3 보다 작으니 i++ ,2<=3 작음 i++,3<=3같음 i++,4<=3 안작음 
			System.out.println(i+"");                 //3번 반복댐 = 1 , 2 ,3 이 결과로 나온다
			
		}
		
		
		System.out.println("-----------------------------");
		for (int i = 5; i>0 ;i-- ) {
			System.out.print  (i+"");
		}
		System.out.println("\n------------------------------");
		int sum = 0; //총합을담을변수
		for (int i = 1; i<10; i++) {
			sum += i; //sum = sum+i 가 10번반복
		}
		System.out.println("1~10 까지의 총 합: " + sum);
		System.out.println("\n-------------------------");
		
		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for (int i = 1; i <= 10; i++) {
		    if (i % 3 == 0) { // i가 3의 배수라면
		        System.out.println("3의 배수: " + i);
		    }
		}

	
		//1부터20까지 홀수만
		for (int i = 1 ; i <= 20;  i++) {
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
		}

		System.out.println("\n-----------------------------------------------");
		//정수형 변수를 하나 초기화 하고 해당 정수에 해당하는 구구단 출력하기

		int j= 3;
		for (int i = 3 ; i<= 9 ; i++) {
			System.out.println(i + " x " + j + " = " + (i * j));
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int total = 0;
		for ( int i=1; i<=num ; i++ ) {
			total += i;
		}
		System.out.println("총 합: " + total);

		
		//10개의 정수를 입력받고 그중에 짝수가 몇개 인지 구하기
		int count = 0; // 짝수의 개수를 저장할 변수

		for (int i = 1; i <= 10; i++) {
		    System.out.print(i + "번째 정수 입력: ");
		    
		    int num1 = sc.nextInt();
		    
		    if (num1 % 2 == 0 && num1 != 0) { 
		        count++;
		    }
		}

		System.out.println("짝수의 개수는: " + count );
	}
	
	
	

}
