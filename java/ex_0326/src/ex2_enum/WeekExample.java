package ex2_enum;

import java.util.Calendar;

// 1. 클래스 밖이나 안에서 'enum' 키워드로 정의해야 합니다.
enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class WeekExample {
	
	public static void main(String[] args) {
		
		//열거형을 사용하는 이유

		//문자열로 상태를 관리하는 경우
		//오타가나도 그냥 문자열 이기 때문에 프로그램은 일단 실행이 된다
		
	//	String status = "배송줭";
		//상태를 숫자로 관리하는 경우
		//1이 주문 완료인지 ,배송중인지, 배송완료인지 관계자 외에는 알 수 없다
		int status =1;
		
		// 열거형을 사용하는 법 
		Week today = null; 
		
		//날짜 랑 시간 정보를  가진 객체이다.
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일을 얻는다(1~7)
		int weekNum = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (weekNum) {
	    case 1: today = Week.SUNDAY; break;
	    case 2: today = Week.MONDAY; break;
	    case 3: today = Week.TUESDAY; break;
	    case 4: today = Week.WEDNESDAY; break;
	    case 5: today = Week.THURSDAY; break;
	    case 6: today = Week.FRIDAY; break;
	    case 7: today = Week.SATURDAY; break;
	}

		if (today == Week.SUNDAY) {
			 System.out.println("일요일엔 축구를 합니다");
		}else {
			System.out.println("열심히 자바를 공부합니다");
		}
		//열거형에 들어가는 값은 그냥 문자열이 아니라 week타입 안에 정의된 상수입니다
		//우리가 만드는 열거형도 하나의 타입 (자료형) ㅇ이라고 할 수 있다
		
		//상수들의 배열 (값을 바꿀수있는)
	}
	
	

}
  