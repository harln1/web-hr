package ex1_innerclass.staticclass;

public class User {
    String id;
    String password;
    String name;
    String email;
    int age;
    String address;
    String phone;

    // 7개 인자를 받는 일반 생성자
    public User(String id, String password, String name, String email, 
                int age, String address, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    // Builder를 인자로 받아 필드를 채워주는 생성자 (build() 호출 시 필요)
    public User(Main.Builder builder) {
        this.id = builder.id;
        this.password = builder.password;
        this.name = builder.name;
        this.age = builder.age;
    }
}
