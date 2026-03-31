package ex1_overriding;

public class Main2 {
    public static void main(String[] args) {
        // 정규직: 이름, 월급
        RegularEmployee re = new RegularEmployee("박길동", 29000);
        System.out.println("이름: " + re.name + ", 급여: " + re.getPay());

        // 알바생: 이름, 시급, 근무시간 
        PrartTimeEmployee prart = new PrartTimeEmployee("김길동", 10000, 160);
        System.out.println("이름: " + prart.name + ", 급여: " + prart.getPay());
    }
}