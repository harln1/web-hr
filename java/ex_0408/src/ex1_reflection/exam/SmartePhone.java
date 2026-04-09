package ex1_reflection.exam;

public class SmartePhone {
	String model;
	int price;
	
	public SmartePhone (String model,int price) {
		this.model = model;
		this.price = price;		
	}
	
	public void showInfo() {
		System.out.println("모델명:"+model + "가격: "+price);
	}
	
	public static void main(String[] args) {
		SmartePhone smartephone = new SmartePhone("iPhone", 100);
		
		smartephone.showInfo();//showInfo() 메서드는 반환 타입이 void   그냥 sysout에 넣지 않고 이렇게 만 써서 출력
		
	}

}
