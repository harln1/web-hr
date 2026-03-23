package ex2_casting;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		//1.작은자료형 -> 큰자료형
		//2.문자형데이터 -> 정수
		
		//작은 자료형에서 -> 큰 자료형으로 바꾸려 할때 자동으로 변환이 된다.
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:"+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:"+longValue);
		
		//문자형 타입의 자동형변환(묵시적 형변환 )
		//문자형 -> 정수형 타입
		char c = 'A';
		int num = c; //문자형타입 데이터를 정수형 변수에 대입
		System.out.println(num); //아스크코드 값을로 변경되어서 나온다.       
		

	}

}
