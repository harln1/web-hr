package ex3_generic;

public class Main {
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("Java");
		System.out.println(v1.getValue());
		
		//제네릭 타입이 정수인객체 v2
		//값 넣고 출력
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(123);
		System.out.println(v2.getValue());
		
		//제네릭 타입이 문자형인 객체v3
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		
		Sample<String> sample = new Sample<String>(10); 


	    sample.addElement("This is String ", 5); 
	    System.out.println(sample.getElement(5));
	    
	    //타입추론
	    //제네릭 메서드를 호출 할 때 전달한 값으로 타입을 자동판단한다
	    Printer p = new Printer();
	    
	    p.printValue("안녕하세요");
	    p.printValue(100);
	    p.printValue(3.14);
	    
	    //명시적으로 타입을 적는 방법
	    p.<String>printValue("안녕");
	    p.<Integer>printValue(100);
	    
	    System.out.println(p.getValue("자바"));
	    System.out.println(p.getValue(10000));
	    
	   //Main에서 다음의 배열들을 출력하기
		//String[] name = {"김철수","이영희","박민수"};
		//Integer[] nums = {10,20,30};
	    ArrayPrinter ap = new ArrayPrinter();
	    
	    String[] name = {"김철수","이영희","박민수"};
		Integer[] nums = {10,20,30};
		
		ap.printArray(name);
		ap.printArray(nums);
		
		
		
	}

}
