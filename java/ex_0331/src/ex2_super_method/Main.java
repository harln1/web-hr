package ex2_super_method;

public class Main {
	public static void main(String[] args) {
		//초음속 비행기 객체 생성
		SuperSonicAirplane sa = new SuperSonicAirplane();
		//takeOff()호출
		sa.takeOff();
		//fly()호츌
		sa.fly();
		//비행모드 초음속 바꾸기
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		//fly()호츌
		sa.fly();
		//비행모드 노말
		sa.flyMode = SuperSonicAirplane.NORMAL;
		//fly()호츌
		sa.fly();
		//착륙하기
		sa.land();
	}

}
