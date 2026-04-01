package ex3_interface;

public class Main {
	public static void main(String[] args) {
		Message[] message = {
				new SmsNotification(),
				new EmailNotification()
		};
		
		for(Message n : message) {
			n.send("안녕하세요");
		}
	}

}
