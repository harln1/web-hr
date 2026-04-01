package ex3_interface;

public class SmsNotification implements Message{
	@Override
	public void send(String name) {
		System.out.println("[SMS]"+name+"를 전송합니다.");
		
		
	}

}
