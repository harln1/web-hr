package ex2_system;

public class TimeExample {
	public static void main(String[] args) {
		//currentTimeMillis()는 현재 시각(날짜 계산 등)을 알기 좋고,
		//nanoTime()은 순수하게 경과 시간(성능 측정 등)을 정밀하게 잴 때 사용합니다.
		
		//1970년 부터 1월 1일 0시 0분 부터 현재까지 흐른 시간을 밀리초 단위로 반환
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		long start = System.currentTimeMillis();
		//작업
		for (int i = 0; i<100000 ;i++) {};
		long end = System.currentTimeMillis();
		System.out.println("걸린시간(ms): "+ (end-start));
		
		//nanoTime ()
		//정확한 시간을 측정하기 위한 메서드
		//나노초(1초 = 10억 ns)

		for(int i = 0; i < 100000; i++) {};

		long end2 = System.nanoTime();

		System.out.println("걸린시간(ms): " + (end2 - start) / 1000000.0);
		
	}

}
