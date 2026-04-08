package ex1_ganeric;

public class Tv implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("Tv전원 켬");
	}

}
