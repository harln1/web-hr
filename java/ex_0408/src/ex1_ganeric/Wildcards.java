package ex1_ganeric;

import java.util.List;

//와일드 카드의 기본문법
//<?> :타입을 모름 아무타입이나 가능함
//<? extends T> : T또는 T의 자식 타입만 가능함(상한 제한)
//<? super T> : T또는 T의 부모타입만 가능함(하한 제한)

//와일드카드가 적혀있는것들은 읽기전용
//?에 뭐가 들어올지 알수 없기때문

public class Wildcards {

    // 1. 비제한 와일드카드 (아무 타입이나 출력 가능)
    public void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // 2. 상한 제한 와일드카드 (Number 또는 그 자식들만 가능)
    // 읽기 전용: 꺼낼 때는 Number로 안전하게 꺼내지만, 추가(add)는 불가능함
    public void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num.doubleValue()); // Number의 기능을 쓸 수 있음
        }
    }

    // 3. 하한 제한 와일드카드 (Integer 또는 그 조상들만 가능)
    // 쓰기 가능: 최소한 Integer는 담을 수 있음이 보장됨
    public void addNumbers(List<? super Integer> list) {
        list.add(10); 
        list.add(20);
    }
}
