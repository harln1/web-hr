package ex1_abstract;

public class Bus extends Transport {
	//상속을 받으면 자식객체가 만들어 질 때 
	//부모 생성자가 먼저 호출이 된다
	//원래 super()가 생략이 되어있는대 부모생성자에 매개변수가 들어있으면 명시해줘얗한다
	 public Bus(String name, int baseFare) {
	        super(name, baseFare);
	    }
	   int calculateFare() {
	        // 버스는 거리에 상관없이 기본요금만 리턴
	        return baseFare;
	    }
	}
