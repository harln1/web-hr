package ex6_sealed;

public class SealedExample {
    public static void main(String[] args) {
        // 1. 객체 생성
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager(); 
        Director d = new Director(); 

        // 2. 메서드 호출
        p.work(); 
        e.work(); 
        m.work(); 
        d.work(); 
    }
}