package ex1_final;

public class Discount {
	
	static final double RATE_HIGH = 0.2 ;
	static final double RATE_MIN = 0.1 ;
	static final double RATE_LOW= 0.05 ;
	//금액에 따라 할인률을 결정하는 disCountRate 메서드
	public static double discountRate (int price) {
		if(price >= 100000) {
			return RATE_HIGH;
		}else if(price >= 50000) {
			return RATE_MIN;
		}else {
			return RATE_LOW;
		}
		
	}
	//최종금액을 계산하는 calculatePrice 메서드
	//할인률이 적용된 금액을 반환
	public static double calculatePrice(int price) {
		double rate = discountRate(price);
		return price * (1-rate);
		
	}

}
