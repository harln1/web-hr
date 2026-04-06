package ex2_system;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {
	public static void main(String[] args) {
		//운영체제와 사용자 정보 출력
		//운영체제 이름
		String osName = System.getProperty("os.name");
		//사용자 이름
		String userName = System.getProperty("user.name");
		//사용자 홈 티렉터리 경로
		String userHome = System.getProperty("user.hjome");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//키 : 값 , 키 : 값
		//속성들에서 key 들 만 뽑아서 변수에 저장해
		Properties props = System.getProperties();
		Set keys = props.keySet();
		//반복문 돌리면서 key에 해당하는 value 를 가져와서 출력해
		for (Object objkey : keys) {
		    String key = (String) objkey;
		    String value = System.getProperty(key);
			 System.out.printf("%-40s: %s\n", key, value);
		}
	}

}
