package customException.ex1_exception;

//NullPointException:참조변수가 null인 상태에서 필드나 메서드에 접근할 경우 발생하는 예외
public class ExceptionHandlingExample1 {
	//문자열데이터를 전달받아 문자열 길이가 얼만지 출력하는 메서드 정하기
	public static void printLength(String data) {
		try {
			//예외가 발생할 수도있고 아닐수도 있음
			System.out.println("문자수: "+data.length());
		} catch (NullPointerException e) { 

			//System.out.println("에러 발생 원인: " + e.getMessage()); 
			//System.out.println(e.toString()); //e.toString() 예외의 종류도 반환
			//e.printStackTrace();//예외가 어디서 발생했는지 추적한 내용까지 출력해준다.'
			System.out.println("에러가 발생했습니다.");
		} 
	}

	public static void main(String[] args) {
		System.out.println("[프로그램] 시작");

		printLength("thisIsJava");
		printLength(null); 

		System.out.println("[프로그램] 종료");
	}
}