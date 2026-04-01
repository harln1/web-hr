package ex3_interface;

public class EmailNotification implements Message{
	@Override
	public void send(String name) {
		System.out.println("[EMAIL]"+name+"을 환영합니다");
		
	}

}
