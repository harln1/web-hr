package ex2_system;

import java.util.Iterator;

public class ExitExample {
	public static void main(String[] args) {
		for (int i = 0 ; i<10 ; i++) {
			System.out.println(i);
			if (i==5) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);//프로그램 강제종료
				//exit 는 int 값을 매개값으로 필요로한다
				//종료 상태값으로 어떤 값을 주더라도 프로세스는 종료되는데
				//정상종료일경우 0 , 비정상 종료일 경우 1 또는 -1 로 주는것이 관례이다.
			}
			
		}
	}

}
