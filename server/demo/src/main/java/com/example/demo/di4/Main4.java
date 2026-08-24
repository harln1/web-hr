package com.example.demo.di4;

import java.io.FileReader;
import java.lang.reflect.Field; // 1. 자동 주입(리플렉션 Field)에 필요한 임포트 추가
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired; // 2. 스프링 @Autowired 임포트 추가
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.google.common.reflect.ClassPath;


@Component class Car{
	@Autowired Engine engine; // 3. 자동 주입 대상 표시
	@Autowired Door door;

	@Override
	public String toString() {
		return String.format("Car[engine= %s , door = %s]" ,engine , door);
	}
};
@Component class SportCar extends Car{};
@Component class Truck extends Car{};
@Component class Engine{};
@Component class Door{};

class AppContext{ 
	Map map;//객체를 저장할map를 선언

	//AppContext 객체가 만들어 질 때 HashMap이 같이 만들어진다
	public AppContext() {
		map = new HashMap();
		doComponentScan();	
		doAutowired(); // 4. 컴포넌트 스캔이 끝나고 나서 자동 주입을 시작하도록 호출
	}

	
	private void doComponentScan() {

		try {
			//AppContext 클래스를 찾아서 메모리에 올려서 객체를 생성할 수 있는 상태로 만든다
			ClassLoader classLoader = AppContext.class.getClassLoader();

			//클래스 경로상의 모든 클래스를 탐색하고 사용할 수 있게 도와준다
			ClassPath classPath = ClassPath.from(classLoader);

			//지정 패키지 내의 모든 클래스의 정보를 가져와라 (3. 패키지 경로 di3 -> di4로 수정)
			Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.example.demo.di4");

			for(ClassPath.ClassInfo classInfo : set) {
				//현재의 ClassInfo객체를 실제로 로드된 클래스(Class)로 변환한다

				Class clazz = classInfo.load();

				//해당 클래스에 @Component가 달려있는지 확인한다
				Component component = (Component) clazz.getAnnotation(Component.class);

				//해당 클래스가 @Component로 지정된 클래스라면
				if(component != null) {
					//key,value를 설정해서 map에 저장해야한다
					String id = StringUtils.uncapitalize(classInfo.getSimpleName());

					map.put(id, clazz.newInstance());

				}
			}


		} catch (Exception e) {

		}

	}


	private void doAutowired() {
		try {
			// 컨테이너 맵에 저장된 모든 객체들을 하나씩 꺼내어 검사합니다.
			for (Object bean : map.values()) {
				// 객체의 필드(변수) 목록을 모두 가져옵니다.
				for (Field field : bean.getClass().getDeclaredFields()) {
					// 해당 필드에 @Autowired 어노테이션이 붙어있는지 확인합니다.
					// 수정한 부분: getAnnotation() 결과가 null이 아닌지 체크하고, 선언된 field 변수명을 정확히 매칭
					if (field.getAnnotation(Autowired.class) != null) {
						field.setAccessible(true); // private 필드 접근 허용
						field.set(bean, getBean(field.getType())); // 타입 기반으로 객체를 찾아 자동 주입
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Object getBean(String key) {
		return map.get(key);
	}

	
	Object getBean(Class clazz) {

		for (Object obj : map.values()) {
			if (clazz.isInstance(obj)) {
				return obj;
			}
		}
		return null;
	}
} 

public class Main4 { 
	public static void main(String[] args) {
		//@Component 가 붙은 클래스를 객체를 만들어서 컨테이너에 담는다.
		AppContext ac = new AppContext();
		
		//자동차 객체는 엔진과 문짝을 필요로한다
		
		Car car = (Car) ac.getBean("car"); 
		


		System.out.println(car);
		
	}
}
