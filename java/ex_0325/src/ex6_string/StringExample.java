package ex6_string;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		//1.String
		//문자들의 집합을 저장하는 객체 타입
		
		//묵시적 객체 생성
		//같은 문자열 이면 객체를 공유
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		if (s1 == s2 ) {
			System.out.println("s1과 s2의 주소가 같습니다.");
		}
		
		//명시적 객체생성 (new를 통해 새로운 객체 생성)
		//항상 새로운 객체가 만들어진다
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		


		//String 은 클래스
		//클래스 안에는 자주 사용하려는 기능들이 메서드 형태로 정의되어있다
		
		//문자열에서 문자를 추출하기
		//char At(index);
		//index : 컴퓨터가 숫자를 세는 방식 (0~ .순차적으로 센다)
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3);
		System.out.println(charValue);

		String ssn = "9201231230123";
		//이사람이 남자인지 여자인지 주민등록증 1,3 남자 2,4 여자
		char charValue2 = ssn.charAt(6); 
		
		if (charValue2 == '1' || charValue2 =='3') {
			System.out.println("남자");
		}else if(charValue2 =='2' || charValue2 == '4') {
			System.out.println("여자");
		}
		
		//문자열의 길이 측정
		//length();
		int length = subject.length();
		System.out.println("문자열의 길이 : "+length);
		
		//특정 문자열을 대체
		//replace ("기존" , "새로운");
		String newStr = subject.replace("자바","JAVA");
		System.out.println(newStr);
		
		//문자열 잘라내기
		//substring (시작index , 끝 index);
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9));
		
		//위치찾기
		//indexOf("문자열");
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);//String subject = "자바 프로그래밍"; 프로그래밍이 시작되는 위치 => 3
		
		index = subject.indexOf("안녕하세요");
		System.out.println(index); //없는걸 찾으면 -1
		
		
		//문자열을 분리
		// split("기준값");
		String board = "번호,제목,내용,성명";
		//분리한 문자열을 배열로 반환
		String[]arr= board.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		//특정 문자열을 포함하고 있는지 여부
		//contains(문자열)
		System.out.println(subject.contains("자바"));//들어있으니깐  true
		
		
		//키보드에서 알파벳을 입력받고 입력받은 문자열에서 소문자 a가 몇개있는지 판별하는 코드 작성하기
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요:");
		String s = sc.next();

		int count = 0;
		
		for (int i = 0; i< s.length() ;i++) {     //s.length() 문자열의 길이가 자동으로정해져서 들어옴 길이모를때사용
			if (s.charAt(i)=='a') { }
			
		}
		System.out.println("a의 갯수: " + count);

		
		// 문자열을 입력받고 그 문자열을 뒤집어 원본과 같으면 "같습니다" 다르면"다릅니다"
		System.out.println("원본 : ");
		String original = sc.nextLine();
		String reverse = "";
		
		for(int i = original.length()-1;i>=0;i--) {
			reverse += original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
