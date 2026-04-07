package ex2_annotaion.standard;


//자바컴파일러가 띄우는 경고메시지를 일부러 무시하도록 지시하는 어노테이션
@SuppressWarnings({"unchecked","deprecation","unused"})

public class SuppressExample {
	@SuppressWarnings("all")
	//경고의 종류
	//unchecked : 타입검사가완정하지 안ㅎ을떼 경고를 숨긴다
	//deprectaion :사용권장 되지 않는 기능ㅇ으 ㄹ사용할때 무시
	//unused :사용하지않는 변수,매개변슈,필드에 대한 경고를 숨긴다
	//all:모든경고무시
	public static void main(String[] args) {
		int num = 100;
//		
//		DeprecatedExample de = new DeprecatedExample();
//		de.oldMethod();
	}

}
