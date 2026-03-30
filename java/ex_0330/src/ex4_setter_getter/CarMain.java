package ex4_setter_getter;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		
		
		c.setSpeed(-50);
		System.out.println("현재속도 : "+c.getSpeed());
		
		//올바른 속도
		c.setSpeed(60);
		System.out.println("현재속도 : "+c.getSpeed());
		
		if(!c.isStop()) {
			c.setStop(true);
		}
		System.out.println("현재속도 : "+c.getSpeed());
	}

}
