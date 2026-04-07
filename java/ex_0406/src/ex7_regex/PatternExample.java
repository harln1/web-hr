package ex7_regex;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		System.out.println(result);
		
		//주민등록번호 정규식 만들기
		regExp = "[0-4]{6}-?[1-7]{7}";//?:앞에 있는걸 써도되고 안써도된다   
		String ssn = "001234-1234567";
		
		result = Pattern.matches(regExp, ssn);
	      
	      String birth = ssn.substring(0,6);
	      
	      int year = Integer.parseInt("20"+birth.substring(0,2));
	      System.out.println("생일 : " + year);
	      int month = Integer.parseInt(birth.substring(2,4));
	      System.out.println("월 : " + month);
	      int day = Integer.parseInt(birth.substring(4,6));
	      System.out.println("일 : " +  day);
	      
	      try {
	         LocalDate.of(year, month,day);
	      } catch (Exception e) {
	         System.out.println("잘못된 날짜");
	      }
	      
	      //숫자만 입력되었는지 검사
	      //문자열이 숫자로만 이루어져 있는지 검사하는 코드
	      //예시 "12345" 는 통과 
	      //예시"12a45" 는 실패
	      String str = "1234567890";
	      
	      regExp = "[0-9]+";
	      
	      System.out.println(str.matches(regExp));
	      
	      
	      //아이디 형식검사
	      //영어 소문자로 시작
	      //영어소문자+숫자만허용
	      //5~12자
	      
	      str="hxrin1";
	      regExp="^[a-z][a-z0-9]{4,11}$";
	      
	      System.out.println(str.matches(regExp));
	      
	      //이메일 형식 검사
	      //아이디부분 : 영문,숫자,_
	      //도메인포함
	      //예시 : test01@gmail.com
	      str= "test01@gmail.com";
	      regExp = "[a-zA-Z0-9]+@[a-z0-9]+.[a-z]{2,}";
	      
	      System.out.println(str.matches(regExp));
	      
	      String[] arr = {"1,2,3","abc","4567","a1b2"};
	      
	      regExp="[0-9]+"; 
	      for(String s : arr) {
	    	  if(s.matches(regExp)) {
	    		  System.out.println(s);
	    	  }
	      }
	      
	      String[] arr2 = {"홍길동","Tom","김철수","a1","김이박길동동"};
	      //한글만 , 2~5글자
	      regExp="[가-힣]{2,5}";
	      for(String s2 : arr2) {
	    	  if(s2.matches(regExp)) {
	    		  System.out.println(s2);
	    	  }
	      }
	      
	      
	      
	    
	      
	      
	   }
	}
