package ex1_innerclass.staticclass;

public class Main {
    public static void main(String[] args) { 
       // 1. 일반 생성자 방식
        User user = new User(
                "hong",
                "1,2,3,4",
                "홍길동",
                "hong@gmail.com",
                20,
                "서울",
                "010-1122-1221");

        // 2. 빌더 패턴 방식 (정적 멤버 클래스 사용)
        User user2 = new Main.Builder()
                        .id("hong")
                        .password("1234")
                        .name("홍길동")
                        .age(20)
                        .build();
    }

    // 정적 멤버 클래스 Builder (Main 클래스의 멤버)
    public static class Builder {
        public String id;
        public String password;
        public String name;
        public int age;

        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        // 최종적으로 User 객체를 생성해서 반환
        public User build() {
            return new User(this);
        }
    }
}



