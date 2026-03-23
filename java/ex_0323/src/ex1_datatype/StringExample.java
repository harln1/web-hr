package ex1_datatype;

public class StringExample {
	public static void main(String[] args) {
		//char c1 = "홍길동";
		String s1 = "홍길동";
		System.out.println(s1);
		System.out.println("홍길동");
		
		//데이터를 변수 안에 넣어서 사용하는 이유는 
		//데이터를 저장하고 재사용하기위해서
		System.out.println(s1.toString());//.toString() 생략 가능 출력할때 뒤에 붙어있음
		
		
		//이스케이프 문자
		//문자열 안에서 특수한 기능을 수행하기 위한 문자

		// \(백슬래시)가 붙으면 이 문자는 특별한 의미로 처리해라
		
		//\n :줄바꿈
		System.out.println("hellow\nWorld");
		//\t : 탭 1개만큼 (스페이스바 4개정도)띠어쓰기 
		System.out.println("hellow\tworld");
		// \" : 큰따옴표 출력
		System.out.println("안녕하세요 \"홍길동\"입니다.");//안녕하세요 "홍길동"입니다
		// \' : 작은따옴표 출력
		System.out.println("안녕하세요 \'홍길동\'입니다");
		// \\ : 백슬래시 출력
		System.out.println("안녕하세요 \\홍길동\\입니다");
		
		//java 13 이후로는 텍스트 블록 문법을 제공한다.
		//println을 쓰거나 \n을 쓸것 없이 
		//작성된 그대로의 문자열을 작성한다.
		String str = """
				여러 줄 작성시 
				
				사용하면 편하다
				""";
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
