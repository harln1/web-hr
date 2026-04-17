package exam;

public class Product {
    private String name;
    private int price;

    // 생성자가 있어야 new Product(이름, 가격)이 가능합니다.
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
