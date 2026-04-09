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
}