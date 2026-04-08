package ex1_reflection.exam2;

import ex1_ganeric.BoxType;
import ex1_reflection.exam.Box;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor<CardPayment> cardProcessor = 
				new PaymentProcessor<CardPayment>(new CardPayment());
		
		cardProcessor.process();

        
        PaymentProcessor<KakaoPay> kakaoProcessor = 
                new PaymentProcessor<>(new KakaoPay());
        kakaoProcessor.process();

        Box<BoxType>box = new Box<>();
       // Box<Object> box = new Box<>();
	}

}
