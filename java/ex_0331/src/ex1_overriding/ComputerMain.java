package ex1_overriding;

public class ComputerMain {
	public static void main(String[] args) {
		double r  = 5.0;
		
		//Calcuator 객체만들고 메서드 호출하기
		Calcuator calcuator = new Calcuator();
		System.out.println(calcuator.areaCircle(r));
		//컴퓨터 객체 만들어서 오버라이딩 된 메서드 호출
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
		
		//오버라이딩의 경우 상속관계에서만 사용가능
	}
	

}
