package ex2__charstream.exam;

public class User {
    private String id;
    private String password;

    // 생성자를 통한 초기화
    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // "아이디 : 비밀번호\n" 형식의 바이트 배열 반환
    public byte[] toByteData() {
        String data = id + " : " + password + "\n";
        return data.getBytes();
    }
}

