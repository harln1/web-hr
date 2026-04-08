package ex1_reflection.log;

import java.io.FileInputStream;
import java.util.Properties;

//리플렉션 + 설정파일
//설정파일을 읽고, 리플렉션으로 객체를 생성해서 반환하는 공장역할
//로그를출력하는 프로그램을 만들되 , 로그 출력방식은 코드가 아니라 설정 파일에 따라 바뀌게 만들기 하기위함

//개발중에는 콘솔에 출력
//운영환경에서는 파일에 저장
public class LoggerFactory {

	public static Logger getLogger() { 
		//Properties :설정파일을 읽어오기 위한 클래스
		Properties prop = new Properties();

		try {
			// 1. 파일을 먼저 읽습니다 (가장 먼저 해야 함!)
			prop.load(new FileInputStream("config.properties"));

			// 2. 파일에서 "loggerClass"라는 키에 저장된 값을 가져옵니다
			String className = prop.getProperty("loggerClass");

			// 3. 리플렉션을 이용해 클래스를 찾습니다
			Class clazz = Class.forName(className);

			// 4. 객체를 생성하고 Logger 인터페이스로 형변환하여 반환합니다
			Object obj = clazz.getDeclaredConstructor().newInstance();
			
			return (Logger)obj;
			
		} catch (Exception e) {
			throw new RuntimeException("Logger 생성실패");
		}
	}
}
