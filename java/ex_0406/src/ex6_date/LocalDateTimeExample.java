package ex6_date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		//JAVA 8 이후에 등장한 현대적인 날짜 API
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//원하는 날짜와 시간을 직접 만들기
		LocalDateTime dateTime = LocalDateTime.of(2026, 4, 6, 16, 13,40);
		System.out.println(dateTime);
		
		//날짜/시간 전체를 알고 있기 때문에 
		//연도 월 일 시 분 등을 꺼낼수 있다
		System.out.println("연도: "+now.getYear());
		System.out.println("월: "+now.getMonthValue());
		System.out.println("일: "+now.getDayOfMonth());
		System.out.println("시: "+now.getHour());
		System.out.println("분: "+now.getMinute());
		System.out.println("초: "+now.getSecond());
		//날짜와 시간 더하기 빼기
		//일 더하기
		System.out.println("10일뒤"+now.plusDays(10));
		//월 더하기
		System.out.println("2달 뒤"+now.plusMonths(2));
		//년 더하기 : pluseYears(숫자)
		//빼기 : minusDay,minusMonth.....
		
		//문자열로 출력형식 바뀨기
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시는 mm분");
		//yyyy년
		//MM월
		//HH시
		//mm분
		//ss초
		String result = now.format(formatter);
		
		System.out.println(result);
		
		//문자열을  LocalDateTime로 바꾸기
		String str = "2026/04/06/ 16:37";
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm");
		LocalDateTime dateTime2 = LocalDateTime.parse(str,formatter);
		
		System.out.println(dateTime2);
		
		//날짜 비교 가능
		
		//isbefore() : ㅇ앞선 시간인지 비교
		//isAfter()  : 뒤의 시간인지 비교
		LocalDateTime meeting = LocalDateTime.of(2026,4,10,14,0);
		
		System.out.println(now.isBefore(meeting));
		System.out.println(now.isAfter(meeting));
		System.out.println(now.isEqual(meeting));
				
		//날짜의 특정 부분ㅁ만 바꾸기
		//이미 만들어진 날짜 / 시간 객체에서
	//연도나 월 일 시를 바꾼 새로운 객체를 만들 수 있다

		
		LocalDateTime changed = now.withYear(2030)
				.withMonth(1); 

		System.out.println("변경 전: " + now);
		System.out.println("변경 후: " + changed);


		//현재 시간이 09:00 ~ 18:00 사이인지 확인하여
		//예약 가능 여부를 출력하세요

		int hour = now.getHour();   
		int minute = now.getMinute(); 

		System.out.println("현재 시간: " + hour + "시 " + minute + "분");

		
		if (hour >= 9 && hour < 18) {
			System.out.println("예약 가능합니다.");
		} else {
			System.out.println("영업 시간이 아닙니다.");
		}
		
		
	}


}
