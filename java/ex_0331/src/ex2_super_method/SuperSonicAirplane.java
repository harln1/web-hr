package ex2_super_method;

public class SuperSonicAirplane extends AirPlane{

	//상수선언 
	//NORMAL = 1
	//SUPERSONIC = 2
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	//NORMAL 상수로 초기화된 flyMode필드 선언
	int flyMode = NORMAL;
	
	//fly()메서드 오버라이딩
	//flyMode 가 SUPERSONIC "초음속 비행을 합니다
	//그게아니면 부모의 fly()호출
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다");
		}else {
			//부모의 메서드 호출
			super.fly();
		}
	}
	
	

}
