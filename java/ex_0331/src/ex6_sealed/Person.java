package ex6_sealed;

// 1. sealed 클래스 선언: Employee와 Manager 클래스에게만 상속을 허용함
public sealed class Person permits Employee, Manager {
    String name;
    

    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다");
    }
    
    
}