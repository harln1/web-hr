package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
		
	
    List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
    long count = orders.stream()
            .filter(price -> price >= 50000)
            .count();
    System.out.println("5만원 이상 주문 개수: " + count);
	
	List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
	
     boolean hasMinor = ages.stream().anyMatch(age -> age < 19);
     boolean allAdults = ages.stream().allMatch(age -> age >= 19);
     boolean noCentenarian = ages.stream().noneMatch(age -> age > 100);
     
     System.out.println("미성년자 존재 여부: " + hasMinor);
     System.out.println("전원 성인 여부: " + allAdults);
     System.out.println("100세 초과 없는지 여부: " + noCentenarian);
     
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
     int sum = numbers.stream()
             .filter(n -> n % 2 == 0)
             .map(n -> n * n)
             .mapToInt(Integer::intValue)
             .sum();
     System.out.println("짝수 제곱의 합: " + sum);
     
     List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
     List<Integer> highScores = scores.stream()
             .filter(score -> score >= 80)
             .sorted(Comparator.reverseOrder())
             .collect(Collectors.toList());
     System.out.println("80점 이상 내림차순: " + highScores);
     
     
     List<Product> products = Arrays.asList(
    		 new Product("마우스", 8000),
    		 new Product("키보드", 30000),
    		 new Product("모니터", 150000),
    		 new Product("노트", 2000)
    		 );
     
     Map<String, Integer> productMap = products.stream()
    		 .filter(p -> p.getPrice() >= 10000)
             .collect(Collectors.toMap(
                     Product::getName,
                     Product::getPrice
             ));
     System.out.println("1만원 이상 상품 : " + productMap);
 }
}
