package ex1_ganeric;

//RemoteControl 인터페이스를 부현한 타입만 들어올수있다.

public class DeviceManager <T extends RemoteControl>{
	private T device;
	
	public DeviceManager (T device) {
		
		this.device = device;
		
	}
	
	public void powerOn() {
		device.turnOn();
	}

}
