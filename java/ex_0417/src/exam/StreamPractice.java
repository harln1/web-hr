package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// import test.Product; <- 같은 패키지(exam)라면 이 줄을 지우거나 수정해야 합니다.

public class StreamPractice {
    public static void main(String[] args) {
        // ... (1~4번 생략) ...

        // 5. Product 리스트를 Map으로 변환
        List<Product> productList = Arrays.asList(
                new Product("마우스", 8000), 
                new Product("키보드", 30000),
                new Product("모니터", 150000), 
                new Product("노트", 2000)
        );

        Map<String, Integer> productMap = productList.stream()
                .filter(p -> p.getPrice() >= 10000)
                .collect(Collectors.toMap(Product::getName, Product::getPrice));

        System.out.println("상품 맵: " + productMap);
    }
}
