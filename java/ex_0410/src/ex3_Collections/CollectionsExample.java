package ex3_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Collections 클래스
//컬렉션을 다룰 때 쓰는 기능들을 static 메서드로 모아놓은 클래스
public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<Integer>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers);
		//오름차순 정렬
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("cherry");
		
		System.out.println(fruits);
		
		//문자열은 사전순으로 정렬이된다 (a b c d e f g...)
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
		//내림차순정렬
		//reverseOrder();
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println(numbers);
		System.out.println("---------------");
		//순서뒤집기
		//reverse();
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(30);
		numbers2.add(10);
		numbers2.add(20);
		
		System.out.println(numbers2);
		Collections.reverse(numbers2);
		System.out.println(numbers2);
		
		System.out.println("---------------");
		//섞기
		//shuffle
		List<Integer> number3 =  new ArrayList<Integer>();
		number3.add(1);
		number3.add(2);
		number3.add(3);
		number3.add(4);
		number3.add(5);
		number3.add(6);
		number3.add(7);
		number3.add(8);
		number3.add(9);
		
		System.out.println(number3);
		Collections.shuffle(number3);
		System.out.println(number3);
		
		System.out.println("-------------------");
		//최대값 최솟값
		//max(),min()
		
		int max = Collections.max(number3);
		int min = Collections.min(number3);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		System.out.println("----------------");
		
	}

}
