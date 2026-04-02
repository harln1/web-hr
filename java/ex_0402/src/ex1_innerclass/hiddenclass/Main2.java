package ex1_innerclass.hiddenclass;

public class Main2 {
    public static void main(String[] args) {
        Home h = new Home();

        h.use1();
        h.use2();
        
        // [수정] 익명 구현 객체를 즉석에서 만들어서 넘겨줘야 합니다.
        h.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("전등을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("전등을 끕니다.");
            }
        }); // 세미콜론 잊지 마세요!
    }
}
