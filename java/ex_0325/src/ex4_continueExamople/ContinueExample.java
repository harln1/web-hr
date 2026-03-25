package ex4_continueExamople;

public class ContinueExample {
	public static void main(String[] args) {
		
	//for 문릐 경우 continue 를 만나게 되면 증감식으로 이동
		
		for(int i = 1; i<= 10 ; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.println(i+ " ");
			i++;
		}
		//while , do-while의 경우 조건식으로 이동
		
		
	}

}
