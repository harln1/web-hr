package exam;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member(1, "홍길동", "ACTIVE"),
            new Member(2, "김철수", "INACTIVE"),
            new Member(3, "이영희", "ACTIVE"),
            new Member(4, "박민수", "INACTIVE"),
            new Member(5, "최지은", "ACTIVE")
        );

      
        System.out.println(" ACTIVE 회원 목록  ");
        members.stream()
               .filter(m -> m.getStatus().equals("ACTIVE")) 
               .forEach(System.out::println);              
    }
}
