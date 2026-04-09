package ex1_List.ArrayList;

public class Member {
    String name;
    int age;

    // 이름을 저장하는 메서드
    public void setName(String name) {
        this.name = name;
    }
    
    // 나이를 저장하는 메서드
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    // Getter: 나이를 가져올 때 (반환타입 int)
    public int getAge() {
        return age;
    }
}
