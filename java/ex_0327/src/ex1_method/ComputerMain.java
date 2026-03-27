package ex1_method;

public class ComputerMain {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		//1,2,3,4,5을 전달해서 총 합 구하기,반환을받아보고 출력해보기
		int sum = c.sum(1,2,3,4,5);
		System.out.println("총 합:"+sum);
		
		sum = c.sum(1,2,3);
		System.out.println("총 합:"+sum);
	}

}
