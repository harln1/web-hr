package ex1_reflection.log;

public class Main {
	public static void main(String[] args) {
		//기존에 우리가 사용하던 방식
		//출력방식을 바꾸려면 자바 코드를 직접수정을 해야됨
		//Logger logger = new ConsolLogger();
		
		//프로그램의 동작 방식이 소스코드에 고정되어잇다
		//미리 확정된 객체 생성방식
//		Logger logger = new FileLogger();
//		logger.log("테스트");
		
		//설정파일방식
		//프로그램이 실행될때 파일을 읽어봐야 방법을 알 수 있다
		Logger logger = LoggerFactory.getLogger();
		logger.log("테스트메시지");
		
		
		
		}
		
		
	}


