package ex2_function;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//람다식의 합성 : 여러 함수를 하나의 함수처럼 연결해서 새로운 함수를 만드는 것

//람다식의 결합 : 함수실행을 순서대로 이어서 실행
public class FunctionExample {
	public static void main(String[] args) {
		//java에서는 다음 인터페이스에서 합성을 지원한다
		//Function<T,R>
		//Predicate<T>
		//Consumer<T>
		
		//핵심메서드
		//andThen()
		//현재 함수를 실행-> 다음 함수를 실행한다
		
		Function<Integer, Integer> multiply = x -> x *2;
		Function<Integer, Integer>add = x -> x+3;
		
		Function<Integer, Integer> result = multiply.andThen(add);
		
		// compose() 활용
		// add(x + 3)를 먼저 실행 -> 그 결과에 multiply(* 2)를 실행
		result = multiply.compose(add);

		System.out.println(result.apply(5)); 
		// 실행 순서: (5 + 3) = 8 -> (8 * 2) = 16
		// 결과: 16
		
		//Predicate의 결합 (조건합치기)
		Predicate<Integer> isPositive = x -> x > 0;
		Predicate<Integer> isEven = x -> x % 2 ==0;
		
		//and()
		
		Predicate<Integer> result2 = isPositive.and(isEven);
		
		System.out.println(result2.test(4));
		System.out.println(result2.test(-2));
		
		//negate()
		result2 = isPositive.negate();
		System.out.println(result2.test(5));
		
		//!(x>0)
		
		//Consumer<T> 의 결합
		//반환값이 없는 함수라서 순서대로 실행하는 결합만가능
		
		//andThen()
		
		Consumer<String> print1 = s -> System.out.println("1 : "+s);
		Consumer<String> print2 = s -> System.out.println("2 : "+s);
		
		Consumer<String> result3 = print1.andThen(print2);
		result3.accept("Hello");
		
		//람다식은 조립이 가능한 함수이다
		
		//문자열을 입력받아서 다음의 처리를 하는 람다식 함수 파이프라인 만들기
		//1.공백제거
		//2.소문자로 변환
		//3. "user_"접두사 붙이기
		Function<String, String> remove = s -> s.replace(" ", "");
	      Function<String, String> lower = s -> s.toLowerCase();
	      Function<String, String> addPrefix = s -> "user_" + s;
	      
	      Function<String,String> pipeline = remove.andThen(lower).andThen(addPrefix);
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("문자열 입력 : ");
	      String input = sc.nextLine();
	      String r = pipeline.apply(input);
	      System.out.println(r);
	
	}
}
