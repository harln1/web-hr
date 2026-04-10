package ex1_set.TreeSetExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//TreeSet
		//데이터를 자동으로 정렬하면서 저장하는 set
		//1.중복허용이안댐
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(50);
		scores.add(10);
		scores.add(30);
		scores.add(20);
		
		System.out.println(scores);
		
		//TreeSet은 정렬되어있기 때문에 특정 범위의 데이터 검색이 편하다
		System.out.println(((TreeSet)scores).first());//가장작은값
		System.out.println(((TreeSet)scores).last());//가장큰값
		
		//lower(X)
		//x보다 작은 값중 가장 가까운값
		System.out.println(((TreeSet)scores).lower(30));
		
		//higher(x)
		//x보다 큰 값중에 가장 가까운 값
		System.out.println(((TreeSet)scores).higher(30));
		
		
		 
	}

}
