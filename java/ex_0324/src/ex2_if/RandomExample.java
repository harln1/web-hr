package ex2_if;

import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		//math 클래스
		//ramdom () 메서드: 0.0 <=~ 1.0 사이의 double타입의 난수를 하나 랜덤으로 뽑아줌
		int num = (int ) ( Math.random()*6)+1; // 1<= x<7;
		//static키워드가 붙어있으면 객체 생성없이 호출가능
		if (num==1) {
			System.out.println("1이 나왔습니다");
		}else if (num ==2) {
			System.out.println("2가 나왔습니다");
		}else if (num ==3) {
			System.out.println("3이 나왔습니다");
		}else if (num ==4) {
			System.out.println("4가 나왔습니다");
		}else if (num ==5) {
			System.out.println("5가 나왔습니다");
		}else {
			System.out.println("6이 나왔습니다");
		}
		/////////////////////////////////////
		//구매금액에 따라 할인률이 적용된 금액 구학
		//10만원 이상 구매 20프로 할인 5만원이상 구매시 10프로 할인 
		//키보드에서 금액을 입력받고 몇프로 할인 받앗는지 최종금액얼마인지 출력
		Scanner sc = new Scanner(System.in);

        System.out.print("구매 금액을 입력하세요: ");
        int price = sc.nextInt();
        double discountRate = 0;

    
        if (price >= 100000) {
            discountRate = 0.2; 
        } else if (price >= 50000) {
            discountRate = 0.1; 
        }

        
        int discountAmount = (int)(price * discountRate);
        int finalPrice = price - discountAmount;

        System.out.println("할인율: " + (int)(discountRate * 100) + "%");
        System.out.println("최종 금액: " + finalPrice + "원");
   
		
	}

}
