package ex3_collection;

public class Main {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		service.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		service.addProduct(new Product("P002", "콜라", 2000, 0));
		service.addProduct(new Product("P003", "도시락", 4500, 5));

		System.out.println("=== 전체 상품 목록 ===");
		service.printAllProducts();

		service.updateProduct("P001", p -> {
			p.setPrice((int) (p.getPrice() * 1.1));
			return p;
		});
		service.updateProduct("P003", p -> {
			p.setName(p.getName().trim());
			return p;
		});

		System.out.println("\n=== 재고가 있는 상품 ===");
		service.findProductsByCondition(p -> p.getStock() > 0);

		service.deleteProductsByCondition(p -> p.getStock() == 0);

		System.out.println("\n=== 품절 상품 삭제 후 ===");
		service.printAllProducts();
	}
}