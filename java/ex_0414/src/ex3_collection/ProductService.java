package ex3_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		if (findByCode(product.getCode()) != null) {
			System.out.println("이미 존재하는 상품 코드입니다.");
			return;
		}
		products.add(product);
	}

	public void printAllProducts() {
		products.forEach(System.out::println);
	}

	public Product findByCode(String code) {
		return products.stream().filter(p -> p.getCode().equals(code)).findFirst().orElse(null);
	}

	// 4) 상품 정보 수정
	public void updateProduct(String code, Function<Product, Product> updater) {
		Product p = findByCode(code);
		if (p != null) {
			updater.apply(p);
		} else {
			System.out.println("상품이 존재하지않습니다");
		}
	}

	// 5) 조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product> predicate) {
		products.stream().filter(predicate).forEach(System.out::println);
	}

	// 6) 조건에 맞는 상품 삭제
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		products.removeIf(predicate);
	}

}
