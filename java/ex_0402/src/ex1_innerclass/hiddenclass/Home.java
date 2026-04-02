package ex1_innerclass.hiddenclass;

public class Home {
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv를 켰습니다");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 껏습니다");
			
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 킵니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
			}
		};
		rc.turnOn();
		rc.turnOff();
	};
	public void use3(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}
	
	public interface Calculator {
	    void add(int x, int y);
	}
	

}
