package ex1_reflection.log;

public class ConsolLogger implements Logger {
	
	@Override
	public void log(String message) {
		System.out.println("[Consol]콘솔에 로그 출력:"+message);
	}

}
