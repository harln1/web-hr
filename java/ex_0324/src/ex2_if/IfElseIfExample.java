package ex2_if;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = -4564;
		//0보다 작은 수가 들어왔을때도 "다시입력해주세여" 
		if (score > 100 || score < 0  ){
			System.out.println("0 이상 100 이하의 수 만 입력해주세요");
		}
		else if(score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("c");
		}else if (score >= 60) {
			System.out.println("D");
		}else 
		 {
			System.out.println("F");
		}
	}

}
