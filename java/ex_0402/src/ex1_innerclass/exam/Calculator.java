package ex1_innerclass.exam;

public class Calculator {
	

	 // Result 정적 내부 클래스
    public static class Result {
        int value;

        // 생성자로 결과 저장
        public Result(int value) {
            this.value = value;
        }

        public void show() {
            System.out.println("계산결과 : " + value);
        }
    }

    //add 메서드
    public Result add(int a, int b) {
        return new Result(a + b);
    }
}