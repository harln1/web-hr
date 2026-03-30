package ex4_setter_getter;

public class Main {
    public static void main(String[] args) {
        
        // 1. 객체 생성
        Student s = new Student();
        
        // 2. Setter를 사용하여 데이터 저장
        s.setName("박하린"); 
        s.setAge(-11); // 직접 접근 s.age = 30; 대신 메서드 사용
        
        // 3. Getter를 사용하여 데이터 출력
        System.out.println("이름: " + s.getName());
        System.out.println("나이: " + s.getAge());
        
        System.out.println("\n-----------------");
        
        User user = new User();
        
        user.setUsername("김이박길똥");
        user.setPassword("12345666677");
        user.setEmail("aaa@gmail.com");
        
        user.userInfo();
       
    }
}
