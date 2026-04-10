package ex1_set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.IntFunction;

//set인터페이스가 제공하는 메서드
//void add(E e):데이터를 삽입
//void remove(Object o) : 선택된데이터삭제
//void clear():모든 데이터를 삭제
//int size():저장된 데이터의 개수를 반환
//contains(E e) :set에 해당 데이터가 저장되어 있는지 확인
public class HashSetExample {
	public static void main(String[] args) {
		//HashSet클래스는 Set 인터페이스 에서 가장 많이 사용되는 구현클래스
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("String");
		set.add("React");
		set.add("JAVA");//겹치는게 있음 아예 추가 X
		
		System.out.println(set);//순서가 마구잡이임
		System.out.println("개수 : "+set.size());
		
		//HashSet에 1~45 사이의 난수 6개 담기
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size() != 6) { 
			int rand= (int)(Math.random()*45)+1;
		    lotto.add(rand); 
		}
		System.out.println(lotto);
		
		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for(int i : lotto2) {
			System.out.println(i);
		}
		
		//set을 배열로 만들기
		//new Integer[0] ->배열의 방 개수를 0 으로 하면 set이 add해둔 개수만큼
		//자동으로 배열의index가 만들어진다
		// toArray()
		Integer[] arr = lotto.toArray(new Integer[0]);
		 
	}

}
