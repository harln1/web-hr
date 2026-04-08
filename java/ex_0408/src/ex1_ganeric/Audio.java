package ex1_ganeric;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("오디오 전원 켬");
	}

}
