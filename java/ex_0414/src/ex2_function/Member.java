package ex2_function;

public class Member {
    private String name;
    private int age;

    // 1. 반드시 생성자가 있어야 합니다!
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    
}
	