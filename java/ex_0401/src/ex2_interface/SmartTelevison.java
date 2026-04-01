package ex2_interface;

public class SmartTelevison implements RemoteControl, Searchable{

	//서로다른 인터페이스에 정의된 추상메서드를 전부 구현해야한다

	
		@Override
		public void search(String url) {
			System.out.println(url + "을 검색합니다.");
		}
		
		//  RemoteControl 인터페이스의 turnOn 구현
		@Override
		public void turnOn() {
			System.out.println("스마트 TV를 켭니다.");
		}

		// RemoteControl 인터페이스의 setVolume 구현 
		@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				System.out.println("볼륨이 최대치(10)를 넘을 수 없습니다.");
			} else if(volume < RemoteControl.MIN_VOLUME) {
				System.out.println("볼륨이 최소치(0)보다 작을 수 없습니다.");
			} else {
				System.out.println("현재 볼륨: " + volume);
			}
			
		}
}
