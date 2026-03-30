package ex1_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		//키보드에서 입력받아 총 금액 구하기
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("사용시간입력 : ");
		int time = sc.nextInt();
		
		//Parking charge = new Parking ();
		int total  = Parking.caculateFee(time);
		
		System.out.println("총금액 : "+total);
		
		
	}

}
