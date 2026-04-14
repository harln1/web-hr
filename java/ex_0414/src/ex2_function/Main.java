package ex2_function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//메서드를 만드,ㄹ때 발생하는 다양한 경우의 수를
// 인터페이스로 만들어놓은것
public class Main {
	public static void main(String[] args) {
		// Cosumer<T>
		// 값을 하나 받아서 소비만하는 인터페이스
		// 즉 , 입력은 있지만 반환값은 없다
		// void accept(T t);

		Consumer<String> consumer = str -> System.out.println("출력 : " + str);
		consumer.accept("안녕하세요");
		consumer.accept("자바");

		List<String> fruits = Arrays.asList("사과", "바나나", "포도");
		// 과일1개를 출력하는 람다식 만들기,리스트에 들어있는 모든 내용을 람다식을 이용해 출력해보기
		Consumer<String> consumer2 = System.out::println;

		for (String fruit : fruits) {
			consumer2.accept(fruit);
		}

		// Supplier<T>
		// 값을 만들어서 공급하는 인터페이스
		// 입력은 없고 반환값만 있다
		// T get()
		Supplier<String> supplier = () -> "안녕하세요";
		System.out.println(supplier.get());

		// Supplier 사용해서 랜덤 주사위 눈을 반환받는 람다식 만들고 눈 뽑기
		Supplier<Integer> dice = () -> new Random().nextInt(6) + 1;
		int result = dice.get();
		System.out.println("주사위 결과: " + result);

		// 랜덤값생성
		// 기본값생성
		// 객체생성
		// 지연생성

		// 즉시 객체 생성
		// 실행하면 무조건 객체가 만들어진다
		ExpensiveObject obj = new ExpensiveObject();

		// supplier로 선언을한다고 해서 객체가 만들어 지는 것 은 아님
		Supplier<ExpensiveObject> supplier2 = () -> new ExpensiveObject();

		// 필요할떄 get() 을 호출해서 객체 생성
		supplier2.get();

		// Function<T,R>
		// 입력값을 받아서 다른 결과값으로 변환하는 인터페이스
		// R apply (T t)

		// 문자열 길이 구하기
		Function<String, Integer> lengthFunction = str -> str.length();

		System.out.println(lengthFunction.apply("hello"));
		System.out.println(lengthFunction.apply("JAVA"));

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result2 = new ArrayList<Integer>();

		// numbers 에 드러오는 모든 요소애 2를 곱하여 result 에 넣기
		numbers.forEach(n -> result2.add(n * 2));

		System.out.println("결과: " + result2);

		// Predicate<T>
		// 값을 받아서 조건을 검사한 뒤 true/false 를 반환하는 인터페이스
		// boolean test(T t);

		// 필터링
		// 유효성검사  
		// 조건 분기
		// 검색조건
		Predicate<String> isLongText = str -> str.length() >= 5;
		System.out.println(isLongText.test("java"));
		System.out.println(isLongText.test("stringggg"));

		// 값을 두개 받아서 소비만한다
		// void accept(T t ,U u);

		BiConsumer<String, Integer> PrintUser = (name, age) -> System.out.println("이름 : " + name + "나이: " + age);

		PrintUser.accept("김철수", 25);

		// BiPredicate<T,U>
		// 값을 두개 받아서 조건 검사후 t/f반환
		// boolean test (T t ,U u)
		BiPredicate<String, String> isSame = (a, b) -> a.equals(b);

		System.out.println(isSame.test("java", "java"));
		System.out.println(isSame.test("java", "BiPredicate"));

//		List만들어서 멤버 데이터 채우기
//		Predicate<Member>로 조건을 정의 (20세 이상)
//		리스트에서 20세 이상인 회원만 출력하기

        List<Member> members = new ArrayList<Member>();
        members.add(new Member("홍길동", 20));
        members.add(new Member("김철수", 18));
        members.add(new Member("이영희", 30));
        members.add(new Member("박민지", 15));

        // 2. private 필드이므로 m.age 대신 m.getAge() 사용
        Predicate<Member> isAdult = m -> m.getAge() >= 20;

        // 3. 변수명 members 확인 및 출력부 완성
        for (Member m : members) { 
            if (isAdult.test(m)) {
                System.out.println("이름: " + m.getName() + ", 나이: " + m.getAge());
            }
        }
    }
}