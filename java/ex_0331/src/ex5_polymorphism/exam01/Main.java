package ex5_polymorphism.exam01;

public class Main {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.payment = new CardPayment();
		order.proccessPayment(50000);
		
		order.payment = new KakaoPayment();
		order.proccessPayment(30000);
	}

}
