package customException.ex1_exception;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		//NullPointException
//		int[] array = null;
//		System.out.println(array[0]);
		
//		//NumberFormatException
//		String str01 = "11.2";
//		int num01 = Integer.parseInt(str01);
		
		//ArrayIndexOutOfBoundsException
		//배열에서 인덱스범위를 초과해 사용할때 발생
//		int[] arr= {1,2,3,4,5};
//		System.out.println(arr[6]);
		
		//AtithmeticExcep
		//정수를 0으로 나누려할때 발생한다
		//system.out.print(10/0);
		
		//InputMismatchException
		//입력 메서드와 입력한 값의 타입이 맞지 않을때
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		int num = sc.nextInt();

	}

}
