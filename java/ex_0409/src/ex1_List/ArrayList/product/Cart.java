package ex1_List.ArrayList.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products = new ArrayList<>();

	//상품 추가 (같은 상품이 들어오면 수량만 증가
	public void addProduct(String name, int price, int quantity) {
		
	    for (Product p : products) {
	        if (p.getName().equals(name)) { 
	            
	            p.setQuantity(p.getQuantity() + quantity); 
	            System.out.println("기존 상품 수량 증가 완료");
	            return;
	        }
	    }
	    products.add(new Product(name, price, quantity));
	    System.out.println("상품 추가 완료");
  
	    
	}
	//장바구니 출력
	public void printCart() {
		//장바구니가 비어있으면 "장바구니가 비어있습니다 출력"
		if(products.size() == 0) {
			System.out.println("장바구니가 비어있습니다");
			return;
		}
		
		//모든 상품을 출력하기
		for (Product p : products) {
			System.out.println(p);
		}
	}
	//총 금액 계산
	public void pritTotalPrice() {
		//"총 결제금액 xx원 "으로 출력
		int total = 0;
		for (Product p : products) {
			total += p.getPrice();
		}
		System.out.println("총 결제금액 " + total + "원");
	}
	
	//상품삭제
	public void removeProduct(String name) {
		//제품이ㅣ있으면 삭제 "상품삭제완료" 

		//저품이 없으면 "해당 제품없음
		for (Product p : products) {

			if (p.getName().equals(name)) {
				products.remove(p); 
				System.out.println("상품 삭제 완료");
				return; 
			}

		}
		System.out.println("해당 제품 없음");
	}
}
