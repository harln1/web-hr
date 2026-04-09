package ex1_List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//ArrayList
		//List 인터페이스를 구현한 대표적인 클래스
		//내부구조: 배열을 기반으로 동작
		//장점: 조회 속도가 빠르다(index로 접근하기 때문에)
		//단점: 중간 삽입/삭제 가 느리다
		
		//java.util 패키지에 들어잇다 
		// 구현클래스의 객체는 해당 인터페이스의 타입변수에 담을 수 있다
		List<String> list = new ArrayList<String>();
		
		//리스트에 데이터 추가(add)하기
		list.add("A");
		list.add("B");


		if (list.add("C")) {
			System.out.println("데이터가 정상적으로 추가 되었습니다");
		}else {
			System.out.println("데이터가 정상적으로 추가 되지않았습니다");
		}

		//내가 원하는위치에 데이터넣기
		list.add(1,"데이터"); //1번자리에 데이터 들어감 [A, 데이터, B, C]
		
		//데이터 값 바꾸기 (set)
		list.set(1,"D");//[A, D, B, C]
		
		
		//리스트에 들어있는 데이터를 하나만 꺼내기
		String s = list.get(0);
		System.out.println(s);//A
				
		//리스트의 출력
		System.out.println(list);
		
		//정수타입을 담을 수 있는 List객체 만들기
		//변수명은 :list2
		List<Integer> list2 = new ArrayList<Integer>();
		
		//2부터 짝수데이터 10개 추가
		for(int i = 1; i <= 10; i++) {
		    list2.add(i * 2); 
		}
		
		System.out.println("리스트의 값: " +list2);//[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		
		//3번인덱스의 내용을 삭제
		int delNum= list2.remove(3); //3번에 있는 숫자를 없애줘
		System.out.println("삭제된 숫자:" + delNum);
		System.out.println("삭제 후 : " +list2);
		
		//데이터를 직접 지우고 싶음
		//숫자타입의 데이터는 객체화 후 삭제
		list2.remove(Integer.valueOf(10));//값을 지정해서 숫자10을 없애줘
		
		boolean result = list2.remove(Integer.valueOf(10));  

		if(result) {
		    System.out.println("삭제가 잘 되었습니다");
		} else {
		    System.out.println("삭제할 데이터가 없습니다");
		}

		System.out.println("데이터 10 삭제 후 리스트: " + list2);
		
		
		
		
		
	}

}



