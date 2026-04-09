package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	public static void main(String[] args) {
		//Integer타입의 리스트 객체 만들기
		List<Integer> list = new ArrayList<Integer>();
	
		//리스트에 (1~30 사이의 ) 난수 10개 넣기

		for(int i = 0; i < 10; i++) {
		    int num = (int)(Math.random() * 30) + 1;
		    list.add(num);
		}

		System.out.println("생성된 난수: " + list);

		//리스트에 담긴 데이터중 홀수의 총합을 구하세요
		int sum = 0;
	
		for(int n : list) {
		    if(n % 2 != 0) { 
		        sum += n;    
		    }
		}

		System.out.println("홀수 총합: " + sum);
		
	}

}
