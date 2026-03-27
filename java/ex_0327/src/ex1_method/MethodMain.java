package ex1_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		//클래스 안에 정의된 메서드 사용하기
		
		//1.객체가 정의되어야 한다
		MethodExample m = new MethodExample();
		
		//2.객체를 통해서 메서드를 호출 변수명.메서드명();
		m.printInfo();
		//메서드의 호출
		 int result = m.add(10,7);
		  System.out.println(result);
		  
		
		 //원의 넓이 :3.14 *반지름*반지름
		//반지름을 외부에서 받아서 넒이를 정하기
//		  Scanner sc = new Scanner (System.in);
//		  System.out.println("반지름: ");
//
//		  double o = sc.nextDouble();
		  
		  m.circleArea(5);
		  
		  System.out.println(result);
		  
		  
		  m.circleRound(5); //return이 업ㅅ을뗴
		  
		  

		  int result2 = m.countChar("apple", 'p');//return 이 있을때
		  System.out.println("p의 갯수 :"+result2);
		
		
		
	
	}

}
