package ex1_Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        // 1. List에서 스트림 생성
        List<String> list = Arrays.asList("A", "B", "c");
        Stream<String> listStream = list.stream();
        System.out.println("--- List Stream ---");
        listStream.forEach(System.out::print); // ABC 출력
        System.out.println("\n");

        // 2. Set에서 스트림 생성
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Stream<Integer> setStream = set.stream();

        // 3. Map에서 스트림 생성
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 1000);
        map.put("바나나", 2000);

        // KeySet() : Key만 스트림으로 생성
        Stream<String> keyStream = map.keySet().stream();
        System.out.println("--- Map KeyStream ---");
        keyStream.forEach(System.out::println);
 
        // values() : Value만 스트림으로 생성
        Stream<Integer> valueStream = map.values().stream();

        // 4. 배열에서 생성하는 방법
        // 4-1. 객체 배열 (String 등)
        String[] strArr = { "사과", "바나나", "포도" };
        Stream<String> strStream = Arrays.stream(strArr);

        // 4-2. 기본 타입 배열 (int, long, double 등)
        int[] intArr = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArr);
        // ※ 주의: Stream<Integer>가 아니라 IntStream을 사용하여 박싱 비용을 줄임
        
        System.out.println("--- IntArray Sum ---");
        System.out.println("합계: " + Arrays.stream(intArr).sum());

        // 4-3. 배열의 일부분만 스트림으로 만들기 (시작 인덱스, 끝 인덱스 직전)
        Stream<String> partStream = Arrays.stream(strArr, 0, 2);  
        
        
        
    }
}
