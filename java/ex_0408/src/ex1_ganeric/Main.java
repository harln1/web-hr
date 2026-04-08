package ex1_ganeric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // new 클래스명<타입>() 순서로 작성
        GrnericBox<String> g1 = new GrnericBox<String>(); 
        g1.setItem("사과");
        System.out.println("String 결과: " + g1.geTItem());

        
        GrnericBox<Integer> intBox = new GrnericBox<>();
        
        intBox.setItem(100);
        System.out.println("Integer 결과: " + intBox.geTItem());


        // Member member = new Member("홍길동", 27);

        MemberResponse<Member> g2 = 
        		new MemberResponse<Member>(true, 
        				"테스트", new Member("홍길동", 27));

        System.out.println(
        		g2.isSuccess());
        // g2.getData()를 통해 Member 객체에 접근
        System.out.println("이름 : " + g2.getData().getName());
        System.out.println("나이 : " + g2.getData().getAge());
        
//        AnimalPrint ap = new AnimalPrint();
//
//        List<Dog> dogList = new ArrayList<>();
//        dogList.add(new Dog());
//
//        List<Cat> catList = new ArrayList<>();
//        catList.add(new Cat());
//
//        ap.printAnimal(dogList);
//        ap.printAnimal(catList);
//        
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        List<Double> b = Arrays.asList(1.2,2.2,3.3,4.4,5.5);

        Main main = new Main();

        System.out.println( main.sum(a));
        System.out.println( main.sum(b));

    } 

    //숫자 타입의 list 를 받아서 총합을 구하는 sum 메서드 만들기  반환타입은 double
    public double sum(List<? extends Number>list){
    	double total = 0;
    	for(Number n :list) {
    		total += n.doubleValue();
    	}
    	return total;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
