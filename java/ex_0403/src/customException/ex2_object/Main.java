package customException.ex2_object;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Product[] products = {
				new Product("키보드",5000,10),
				new Product("마우스", 2550, 2),
				new Product("모니터", 2000, 8)
		};
		
		for (Product p : products) {
		    System.out.println(p);
		}
		
		
		
		Member2 m1 = new Member2("user01", "홍길동");
        Member2 m2 = new Member2("user01", "홍길동");
        Member2 m3 = new Member2("user02", "이동동");

        
        System.out.println("첫번째 회원과 두번째 회원비교 : " + m1.equals(m2));

        System.out.println("첫번째 회원과 세번째 회원비교 : " + m1.equals(m3));


        Object[] arr = {"Java",100,3.14, new Employee("홍길동","개발팀")};
        //반복문으로 배열을 순회하며
        //문자열이면 "문자열데이터" : XX
        //정수면 "정수데이터" : XX
        //실수면 "실수데이터" : XX
        //Employee 객체면 이름과 부서를 출력해주세요

        //instanceof 활용

        for (Object obj: arr) {

        	if (obj instanceof String)
        		System.out.println("문자열데이터 : "+obj);

        	else if(obj instanceof Integer) 
        		System.out.println("정수데이터: "+obj); 

        	else if(obj instanceof Double) 
        		System.out.println("실수데이터: "+ obj);

        	else if(obj instanceof Employee ) {
        		Employee e = (Employee)obj;
        		System.out.println("사원명 : " + e.name);
        		System.out.println("부서 : " + e.dept);
        	}

        }
	}
}
