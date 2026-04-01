package ex1_abstract;

public abstract class Transport {

	//필드-> 생성자통해 값 전달받기
	String name; //운송수단 이름
	int baseFare;//기본요금

	public Transport (String name , int baseFare) {
		this.name = name;
		this.baseFare = baseFare;
	}
	//메서드
	public String showName() {

		return name;
	}
	//추상메서드
	abstract int calculateFare();

	// 요금 출력 메서드
	public void printFare() {
	    System.out.println("교통수단: " + showName());
	    System.out.println("기본요금: " + baseFare);
	    // 전달할 인자 없이 호출
	    System.out.println("총 요금 : " + calculateFare() + "원");
	}
}