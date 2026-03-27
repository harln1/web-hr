package ex1_method;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		TimesTable t = new TimesTable();
		
		Scanner sc = new Scanner (System.in);
		System.out.print("단입력 : ");
		
		//return을 통해 반환값을 받으면 연산결과를 변수에 대입
		//없으면 그냥 호출
		
		t.showTable(sc.nextInt());
		
		
		
		
		

	}

}
