package ex1_Stream;

import java.util.Arrays;
import java.util.List;

public class MiddleCalculatorExample {
    public static void main(String[] args) {
        //1. 스트림의 연산
        
        //1-1.중간연산
        //  특징: 
        //  1.메서드의 연산결과로 다른 Stream 객체를 반환한다
        //  2.혼자서는 최종결과를 낼 수 없다
        //  3.최종연산이 와야 중간 연산들이 실제로 동작한다
        //  4.중간연산은 메서드 체이닝을 통해 연결할 수 있다
        
        //filter 조건
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
        
        System.out.println(list);
        
        //요소의 변환
        //map
        List<String> sList = List.of("java", "spring", "react");
        
        sList.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
        
        //maptoInt()
        //객체 스트림을 IntStream 으로 변환합니다
        List<String> list2 = List.of("a", "bb", "cc");
        
        list2.stream()
            .mapToInt(String::length)  
            .forEach(System.out::println);
        
        //제한 . 건너뛰기
        //limit(long maxSize): 앞에서 부터 지정한 갯수만 남긴다
        //skip(long n): 앞에서 부터 지정한 갯수만큼 건너뛴다
        list.stream()
            .skip(2)       // 1, 2 건너뜀
            .limit(3)      // 3, 4, 5만 남김
            .forEach(System.out::println);

        //중복 제거
        //distinct(): 중복된 요소를 제거한다
        List<Integer> list3 = Arrays.asList(1, 1, 2, 2, 3);
        list3.stream()
            .distinct()
            .forEach(System.out::println);
        
        //상태확인
        //peek: 스트림 요소를 소비하지 않고 중간에 작업을 수행 (주로 디버깅용)
        sList.stream()
            .filter(s -> s.length() >= 5)
            .peek(s -> System.out.println("필터통과: " + s)) 
            .forEach(System.out::println); 
    }
}
