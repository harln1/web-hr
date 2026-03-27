package ex1_method;

public class Computer {
	public int sum (int ... values) {
		int sum = 0; //지역변수 (이 함수 안에서만 영향이있음)
		
		for (int x : values) {
			sum += x;
		}
		
		//return 을 했을때 1.값을 반환하는 경우
		//				 2.메서드 내부에서 출력하고 끝내는경우
		return sum;//총 합 들어온걸 반환(sum을 내보낸다->)
	}

}
