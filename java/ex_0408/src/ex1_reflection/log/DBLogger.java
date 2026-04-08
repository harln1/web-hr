package ex1_reflection.log;

public class DBLogger implements Logger{
	@Override
	public void log(String message) {
		System.out.println("[DB] DB에 로그저장 :"+message);
	}
}
