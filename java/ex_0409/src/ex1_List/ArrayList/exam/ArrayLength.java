package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		//문자열타입 리스트 객체를 만든다
		List<String> list = new ArrayList<String>();
		//리스트에 "Java","String","HTML","CSS"를 저장
		list.add("Java");
		list.add("String");
		list.add("HTML");
		list.add("CSS");
		
		//각 문자열의 길이를 계산하여 lengths 라는 새로운 리스트 만들어 저장
		
		List<Integer> lengths = new ArrayList<Integer>(); 
		for (String s : list) {
		    int len = s.length();		     
		    lengths.add(len); 
		}
		
		System.out.println("문자열 길이 리스트: " + lengths);
		
		//문자열형태의 리스트 생성하기
		//김철수,이영희,김철수,박민수,김철수 저장하기
		//리스트에서 김철수가 몇번있는지 출력
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("김철수");
		nameList.add("이영희");
		nameList.add("김철수");
		nameList.add("박민수");
		nameList.add("김철수");
		
		int count = 0;
		for(String s : nameList) {
			if(s.equals("김철수")) {
				count++;
			}
		}
		System.out.println(count);
		
		//score라는 이름의 정수타입 리스트를 만든다
		//88,72,95,60,81을 저장한다
		//최고점수와 최소점수를 찾아서 차이를 출력하세요
		
		List<Integer> score = new ArrayList<Integer>();
		score.add(88);
		score.add(72);
		score.add(95);
		score.add(60);
		score.add(81);
		
		int max = score.get(0);
		int min = score.get(0);
		
		for(int i :score) {
			if(i  > max ) {max = i;}
			if(i < min) {min = i;}
		}
		
		System.out.println("최고점수 : "+max);
		System.out.println("최소점수  : "+min);
		System.out.println("점수차이 : "+ (max-min));
		
	}
}
