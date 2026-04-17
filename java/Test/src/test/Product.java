package test;

public class Product {	
	 String name;
	 int stock;
	
	public Product() {
		this.name = name;
		this.stock = stock;
	}
	
	public void sell(int amount) {
		if(amount>stock) {
			System.out.println("재고가 부족합니다");
		}else if (amount<stock) {
			System.out.println("판매완료");
		}	
	}
	
	public void printInfo() {
		System.out.println();
	}
}
