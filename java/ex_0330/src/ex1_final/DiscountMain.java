package ex1_final;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		
	
	//금액을 키보드에서 입력받아 할인적용금액 구하기
	
	Scanner sc = new Scanner (System.in);
	System.out.println("상품 금액입력: ");
	int price  = sc.nextInt();
	

	Discount discount = new Discount();
	
	double result  = discount.calculatePrice(price);
	
	System.out.println("총 할인 : "+ result );
	}
}
