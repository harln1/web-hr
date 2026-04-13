package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // 1. Map 선언 (오타 수정: Strinng Integrt -> String, Integer)
        // 최근 자바 버전에서는 <> (다이아몬드 연산자)만 써도 됩니다.
        Map<String, Integer> map = new HashMap<>();
        
        // 2. 데이터 저장 (Key, Value)
        map.put("사과", 10000);
        map.put("배", 15000);
        map.put("포도", 20000);
     
        System.out.println(map);
        
        //저장한 데이터를 꺼내기
        //get
        int price = map.get("사과");
        
          
        map.put("사과",1500);
        System.out.println("사과의ㅣ 가격 : "+map.get("사과"));
        
        //데이터 삭제하기
        //remover(Key)
        map.remove("사과");
        System.out.println(map);
        
        // size()
        System.out.println("map의 크기: " + map.size());
        
        // 컬렉션이 비어있는지 확인
        System.out.println("map이 비어있나요? " + map.isEmpty());
        
        // Map의 전체 데이터를 다루는 법
        // map에 들어있는 모든 key를 Set으로 반환: keySet()
        java.util.Set<String> keys = map.keySet();
        
        System.out.println("--- 전체 데이터 출력 ---");
        for (String key : keys) {
            int val = map.get(key); // key를 이용해 value를 꺼냄
            System.out.println(key + " : " + val);
        }
        
        Set<Map.Entry<String,Integer>> set2 = map.entrySet();
        
        for(Map.Entry<String , Integer> entry : set2) {
        	System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
        
        //key가 존재하면 value를 반환하고,없으면 기본값 default 을 반환하는 메서드
        //getOrDefault(Object Key, V defaultValue) ;
        
        //get()을 했을때 key가 없으면 null을반환
        
        System.out.println(map.getOrDefault("사과", 1500));
    }
}

